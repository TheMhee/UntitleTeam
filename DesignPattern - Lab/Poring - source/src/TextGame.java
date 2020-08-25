
import java.util.ArrayList;
import java.util.Scanner;

public class TextGame extends Thread{
	
	private ArrayList<Monster> monsterList; 
	

	public void allMonsterList_info(ArrayList<Monster> monsterList) {
		//This method print all monster in monsterList info
		int size = monsterList.size();
		for (int i = 0; i < size; i++) {
			System.out.println("===================================================================");
			System.out.println((i+1)+"");
			monsterList.get(i).monsterInfo();
			System.out.println("===================================================================");
		}
	}
	
	
	public TextGame() {
		//This constructor will get poring from MonsterPool and store in ArrayList
		MonsterPool poringPool = MonsterPool.getInstance();
		int range = (int)(Math.random() * 5) + 1;
		ArrayList<Monster> monsterList = new ArrayList();
		poringPool.preparePool(range);
		for (int i=0; i < range; i++) {
			try {
				monsterList.add(poringPool.getMonster());
			}
			catch(IndexOutOfBoundsException e) {
				poringPool.addMonster();
				monsterList.add(poringPool.getMonster());
			}
		}
		System.out.println("===================================================================");
		System.out.println(range+" Monster appeared");
		this.allMonsterList_info(monsterList);
		this.monsterList = monsterList;
	}
	
	
	public ArrayList<Monster> getMonsterList() {
		return monsterList;
	}

	public void delay(int timeMs) {
		try { 
			Thread.sleep(timeMs); 
		} catch (InterruptedException e) { 
			e.printStackTrace(); 
		} 
	}

	public static void main(String[] args) {
		//setup
		TextGame textGame = new TextGame();
		Player player1 = new Player("Mheeeee", 50, 20);
		Scanner sc = new Scanner(System.in);
		MonsterPool poringPool = MonsterPool.getInstance();
		ArrayList monsterList = textGame.getMonsterList();
		while(monsterList.size() > 0) {
			
			//choose monster
			System.out.print("Please type number of monster to attack :");
			for (int i = 0 ; i < monsterList.size(); i++) {
				System.out.print(" "+(i+1)+(", "));
			}
			System.out.println("");
			int number = sc.nextInt();
			
			//attacking phase
			if (number > monsterList.size() || number <= 0) {
				System.out.println("Invalid number");
			}
			else {
				Monster poring = (Monster)monsterList.get(number-1);
				int remainHP = poring.attack(player1);
				textGame.delay(1000);
				if (remainHP <= 0) {
					monsterList.remove(number-1);
					//monster die and sent Monster object back to Pool
					poringPool.deadMonster(poring);
					
					System.out.println(poring.getName()+" die");
					textGame.delay(1000);
				}
				textGame.allMonsterList_info(monsterList);
				if (monsterList.size() == 0) {
					System.out.println("Battle End");
				}
			}
		}
	}
}

