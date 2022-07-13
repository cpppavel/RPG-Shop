package beleg2package;

public class Bow extends Item implements BuyableIF {

	private int damage;
	private String name;
	private int id;
	private String[] names = {"Daedalus", "Dragon Lance","Sacred Relic","Wind Waker","Hurricane Pike","Butterfly"};

	public Bow() {
		super();
		damage = price/10; 
		name = names[r.nextInt(names.length)];
	}
	
	public String toString() {
		return "Bow [name = " + getName() + ", damage = " + getDamage() + ", price = " + getPrice() + ", id = " + getMyId() + "]";
	}
	
	
	public int getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public void selling(Player toPlayer) {
		toPlayer.backpack.add(this);
		toPlayer.setDamage(toPlayer.getDamage() + getDamage());
		toPlayer.setGold(toPlayer.getGold() - getPrice());
	}

}
