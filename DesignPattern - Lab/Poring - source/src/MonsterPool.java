import java.util.ArrayList;

public class MonsterPool {
	private static MonsterPool instance;
	private ArrayList<Monster> reuseableMonster;
	private final int reuseableSize = 5;
	
	public Monster getMonster() {
		Monster monster = this.reuseableMonster.get(0);
		this.reuseableMonster.remove(0);
		return monster;
		
	}
	public void deadMonster(Monster monster) {
		//Receive monster back to pool
		if(this.reuseableMonster.size() < 5) {
			this.reuseableMonster.add(monster);
		}
	}
	private MonsterPool() {
		ArrayList<Monster> list = new ArrayList<Monster>();
		list.add(new Monster("Poring", 20, 5));
		this.reuseableMonster = list;
		System.out.println("Create Pool Success");
	}
	
	public static MonsterPool getInstance() {
		if (instance == null) {
			instance = new MonsterPool();
		}
		return instance;
	}
	
	public void addMonster() {
		if (this.reuseableMonster.size() < 5) {
			//System.out.println("addMonster Method - reuseableMonster_Size : "+reuseableMonster.size());
			Monster newMonster = (Monster) this.reuseableMonster.get(0).clone();
			this.reuseableMonster.add(newMonster);
		}
	}
	public void preparePool(int size) {
		for (int i = 0; i< size; i++) {
			this.addMonster();
		}
	}
	public void allMonstersInfo() {
		ArrayList<Monster> temp = this.reuseableMonster;
		for (int i = 0; i < this.reuseableMonster.size(); i++) {
			System.out.println((i+1)+"");
			temp.get(i).monsterInfo();
		}
	}
	
}
