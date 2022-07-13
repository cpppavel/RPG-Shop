package beleg2package;

import java.util.ArrayList;
import java.util.List;

public class Smithy{
	
	List <Item> inventory = new ArrayList<Item>();

	public Smithy() {
		generateInventory();
	}
	
	public void generateInventory() {
		inventory.clear();
		for (int i = 0; i < 8; i++) {
			if (i<4) {
				Bow b = new Bow();
				inventory.add(b);
			}
			else {
				Sword s = new Sword();
				inventory.add(s);
			}
		}
	}

}
