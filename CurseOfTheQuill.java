package beleg2package;

public class CurseOfTheQuill extends Item implements BuyableIF {

	private int perimeter;
	private String name;
	private String[] names = {"Scroll of Fire Storm", "Scroll of Ice Storm","Scroll of Fireball"};


	public CurseOfTheQuill() {
		super();
		perimeter = price/5 + 10; 
		name = names[r.nextInt(names.length)];
	}
	
	public String toString() {
		return "Curse Of The Quill [name = " + getName() + ", perimeter = " + getPerimeter() + ", price = " + getPrice() + ", id = " + getMyId() + "]";
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
