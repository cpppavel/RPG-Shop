package beleg2package;

public class Game {

	public static void main(String[] args) {
		Smithy s = new Smithy();
		Jeweler j = new Jeweler();
		Bookstore b = new Bookstore();
		Player p = new Player("Jack");
		p.showInfo();
		p.buying(s, b, j);
		p.showInfo();
	}

}
