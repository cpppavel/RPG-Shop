package beleg2package;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

	private String name;
	private int gold;
	private int damage;
	private int combatStrength;
	Random r = new Random(); 
	List <Item> backpack = new ArrayList<Item>();
	
	
	public Player(String name) {
		this.name = name;
		gold = 1000;
		damage = 0;
		combatStrength = 0;
	}

	
	public void buying(Smithy s, Bookstore b, Jeweler j){
		int z;
		while (backpack.size() < 3) {
		z = r.nextInt(b.inventory.size());
		if ((b.inventory.size() == 6)&&(b.inventory.get(z).getPrice() < getGold())) {
			b.inventory.get(z).selling(this);
			b.inventory.remove(z);
			}
		z = r.nextInt(s.inventory.size());
		if ((s.inventory.size() == 8)&&(s.inventory.get(z).getPrice() < getGold())) {
			s.inventory.get(z).selling(this);
			s.inventory.remove(z);
			}
		z = r.nextInt(j.inventory.size());
		if ((j.inventory.size() == 8)&&(j.inventory.get(z).getPrice() < getGold())) {
			j.inventory.get(z).selling(this);
			j.inventory.remove(z);
			}
		}
		for (int i = 0; i < b.inventory.size(); i++) {
			if (b.inventory.get(i).getPrice() < getGold()) {
				b.inventory.get(i).selling(this);
				b.inventory.remove(i);
				i--;
				}
		}
		for (int i = 0; i < j.inventory.size(); i++) {
			if (j.inventory.get(i).getPrice() < getGold()) {
				j.inventory.get(i).selling(this);
				j.inventory.remove(i);
				i--;
				}
		}
		for (int i = 0; i < s.inventory.size(); i++) {
			if (s.inventory.get(i).getPrice() < getGold()) {
				s.inventory.get(i).selling(this);
				s.inventory.remove(i);
				i--;
				}
		}
		

	}

	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("gold: " + gold);
		System.out.println("damage: " + damage);
		System.out.println("combat strength: " + combatStrength);
		System.out.println("Backpack: ");
		for (int i = 0; i < backpack.size(); i++) {
			System.out.println(backpack.get(i).toString());
		}
		
	}

	public String getName() {
		return name;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getCombatStrength() {
		return combatStrength;
	}


	public void setCombatStrength(int combatStrength) {
		this.combatStrength = combatStrength;
	}

}
