package beleg2package;

public class Sword extends Item implements BuyableIF {
	
	private int damage;
	private String name;
	private String[] names = {"Mind Breaker", "Titan Sliver","Paladin Sword","Ninja Gear","Fallen Sky","Shadow Blade "};

	public Sword() {
		super();
		damage = price/10; 
		name = names[r.nextInt(names.length)];
	}
	
	public String toString() {
		return "Sword [name = " + getName() + ", damage = " + getDamage() + ", price = " + getPrice() + ", id = " + getMyId() + "]";
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
