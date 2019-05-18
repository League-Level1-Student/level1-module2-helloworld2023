package _02_sea_creature;

public class Sea_Creature_Runner {
	
	 public static void main(String[] args) {
		 SeaCreature sp = new SeaCreature("Spongebob");
			sp.eat();
			sp.laugh();
		SeaCreature pa = new SeaCreature("Patrick");
			System.out.println(pa.getName());
			pa.eat();
			pa.laugh();
		SeaCreature sq = new SeaCreature("Squidward");
			System.out.println(sq.getName());
			sq.eat();
			sq.laugh();
	}

}
