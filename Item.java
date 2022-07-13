package beleg2package;

import java.util.Random;

public abstract class Item implements BuyableIF{

	protected int price;
	private static int id = 0;
    private final int myId;
	
	Random r = new Random();
	
	public Item() {
		this.price = r.nextInt(400);
		myId = id++;
	}

	public int getPrice() {
		return price;
	}

	public int getMyId() {
		return myId;
	}


}
