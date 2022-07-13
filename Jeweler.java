package beleg2package;

import java.util.ArrayList;
import java.util.List;

public class Jeweler {

	List <Item> inventory = new ArrayList<Item>();

	public Jeweler() {
		generateInventory();
	}
	
	public void generateInventory() {
		inventory.clear();
		for (int i = 0; i < 8; i++) {
			if (i<4) {
				SilverRing b = new SilverRing();
				inventory.add(b);
			}
			else {
				GoldRing s = new GoldRing();
				inventory.add(s);
			}
		}
	}

}
