public class Beast extends Monster{

	private float health;
	private float defense;
	private float speed;
	private float attack;
	
	public Beast(float health, float defense, float speed, float attack) {
		this.health=health;
		this.defense=defense;
		this.speed=speed;
		this.attack=attack;
	}
	
	@Override
	public float getHealth() {
		return this.health;
	}

	@Override
	public float getDefense() {
		return this.defense;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}
	@Override
	public float getAttack() {
		return this.attack;
	}
	
}
