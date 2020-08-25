
public class Monster implements Cloneable{
	private String name;
	private int healthPoint;
	private int attackPoint;

	
	public Monster(String name, int healthPoint, int attackPoint) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.attackPoint = attackPoint;
	}

	public int attack(Player player) {
		this.healthPoint = this.healthPoint - player.getAttackPoint();
		System.out.println(player.getName()+": attacked success");
		return this.healthPoint;
	}
	
	public Monster clone() {
		return new Monster(this.name, this.healthPoint, this.attackPoint);
	}

	public int getHealthPoint() {
		return healthPoint;
	}
	
	public String getName() {
		return name;
	}

	public void monsterInfo() {
		System.out.println("Name : "+this.name+"\nHP : "+this.healthPoint+"\nATK : "+this.attackPoint);
	}

	
	
}
