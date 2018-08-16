package com.guitar.store;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick’s guitar inventory
		Inventory inv = new Inventory();

		GuitarSpec whatErinLikes = new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER);

		List<Guitar> matchingGuitars = inv.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();

				System.out.println(" We have a " + guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " "
						+ guitar.getSpec().getType() + " guitar:\n " + guitar.getSpec().getBackwood() + " back and sides,\n "
						+ guitar.getSpec().getTopwood() + " top.\n You can have it for only $" + guitar.getPrice() + "!\n ----");
			}
		} else {
			System.out.println("Sorry, we have nothing for you");
		}
	}
}
