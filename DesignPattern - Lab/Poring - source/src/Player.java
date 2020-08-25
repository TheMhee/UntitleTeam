
public class Player {
	private String name;
	private int healthPoint;
	private int attackPoint;
	public Player(String name, int healthPoint, int attackPoint) {
		super();
		this.name = name;
		this.healthPoint = healthPoint;
		this.attackPoint = attackPoint;
	}
	
	public void attack(int attackPoint) {
		this.healthPoint = this.healthPoint - attackPoint;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public String getName() {
		return name;
	}

	
}
