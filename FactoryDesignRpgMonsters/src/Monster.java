
public abstract class Monster {
	public abstract float getHealth();
	public abstract float getDefense();
	public abstract float getSpeed();
	public abstract float getAttack();
	
	@Override
	public String toString() {
		return "Health= " +this.getHealth()+", Defense= "+this.getDefense()+", Speed= "+this.getSpeed()+ ", Attack= "+this.getAttack();
	}
}
