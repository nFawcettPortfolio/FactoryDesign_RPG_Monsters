import java.util.Random;
public class Main {
	public static void main(String[] args){
		 Random rand = new Random();
		 int bound=4;
		 int r = rand.nextInt(bound);
		 System.out.println("You have encountered a monster!");
		 Monster alien = MonsterFactory.getMonster("Alien", 10f, 5f, 5f, 16f);
		 Monster beast = MonsterFactory.getMonster("Beast", 16f, 12f, 12f, 10f);
		 Monster mech = MonsterFactory.getMonster("Mech", 20f, 16f, 8f, 16f);
		 Monster undead = MonsterFactory.getMonster("Undead", 12f, 5f, 4f, 8f);
		 switch(r) {
		 case 0:
			 System.out.println("Alien: "+alien);
			 break;
		 case 1:
			 System.out.println("Beast: "+ beast);
			 break;
		 case 2:
			 System.out.println("Mech: " + mech);
			 break;
		 case 3:
			 System.out.println("Undead: "+undead);
			 break;
		 }
	}
}
