package beleg2package;

public class SilverRing extends Item implements BuyableIF {
	
	private int combatStrength;
	private String name;
	private String[] names = {"Ring of Protection", "Ring of Regen","Ring of Health","Perseverance","Ring of Basilius","Eye of Skadi"};


	public SilverRing() {
		super();
		combatStrength = price/10; 
		name = names[r.nextInt(names.length)];
	}
	
	public String toString() {
		return "Silver Ring [name = " + getName() + ", combat strength = " + getCombatStrength() + ", price = " + getPrice() + ", id = " + getMyId() + "]";
	}

	public String getName() {
		return name;
	}

	public int getCombatStrength() {
		return combatStrength;
	}
	
	public void selling(Player toPlayer) {
		toPlayer.backpack.add(this);
		toPlayer.setCombatStrength(toPlayer.getCombatStrength() + getCombatStrength());
		toPlayer.setGold(toPlayer.getGold() - getPrice());
	}

}
