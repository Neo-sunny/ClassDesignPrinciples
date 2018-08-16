package com.guitar.store;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick’s guitar inventory
		Inventory inv = new Inventory();
		inv.initializeInventory();

		Guitar whatErinLikes = new Guitar("", 0.0, "Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER);

		List<Guitar> matchingGuitars = inv.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();

				System.out.println(" We have a " + guitar.getBuilder() + " " + guitar.getModel() + " "
						+ guitar.getType() + " guitar:\n " + guitar.getBackwood() + " back and sides,\n "
						+ guitar.getTopwood() + " top.\n You can have it for only $" + guitar.getPrice() + "!\n ----");
			}
		} else {
			System.out.println("Sorry, we have nothing for you");
		}
	}
}
