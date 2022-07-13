package beleg2package;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

	List <Item> inventory = new ArrayList<Item>();

	public Bookstore() {
		generateInventory();
	}
	
	public void generateInventory() {
		inventory.clear();
		for (int i = 0; i < 6; i++) {
			if (i<2) {
				CurseOfTheQuill b = new CurseOfTheQuill();
				inventory.add(b);
			}
			else {
				EyeOfHypnos s = new EyeOfHypnos();
				inventory.add(s);
			}
		}
	}

}
