
public class MonsterFactory {
	public static Monster getMonster(String type, float health, float defense, float speed, float attack) {
		if("Alien".equalsIgnoreCase(type)) return new Alien(health, defense, speed, attack);
		else if("Beast".equalsIgnoreCase(type)) return new Beast(health, defense, speed, attack);
		else if("Mech".equalsIgnoreCase(type)) return new Mech(health, defense, speed, attack);
		else if("Undead".equalsIgnoreCase(type)) return new Undead(health, defense, speed, attack);
		return null;
	}
}
