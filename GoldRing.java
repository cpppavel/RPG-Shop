package beleg2package;

public class GoldRing extends Item implements BuyableIF {
	private int taming;
	private String name;
	private String[] names = {"Essence Ring", "Ring of Aquila","Timeless Relic","Stormcrafter","Giant's Ring","Ancient Perseverance"};


	public GoldRing() {
		super();
		taming = price/50 + 1; 
		name = names[r.nextInt(names.length)];
	}
	
	public String toString() {
		return "Gold Ring [name = " + getName() + ", taming = " + getTaming() + ", price = " + getPrice() + ", id = " + getMyId() + "]";
	}

	public String getName() {
		return name;
	}

	public int getTaming() {
		return taming;
	}
	
	public void selling(Player toPlayer) {
		toPlayer.backpack.add(this);
		toPlayer.setGold(toPlayer.getGold() - getPrice());
	}
}
