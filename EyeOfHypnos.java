package beleg2package;

public class EyeOfHypnos extends Item implements BuyableIF {

	private int perimeter;
	private String name;
	private String[] names = {"Scroll of Paralyze", "Scroll of Mass Paralysis","Scroll of Fear"};


	public EyeOfHypnos() {
		super();
		perimeter = price/3 + 10; 
		name = names[r.nextInt(names.length)];
	}
	
	public String toString() {
		return "Eye of hypnos [name = " + getName() + ", perimeter = " + getPerimeter() + ", price = " + getPrice() + ", id = " + getMyId() + "]";
	}

	public String getName() {
		return name;
	}

	public int getPerimeter() {
		return perimeter;
	}
	
	public void selling(Player toPlayer) {
		toPlayer.backpack.add(this);
		toPlayer.setGold(toPlayer.getGold() - getPrice());
	}
}
