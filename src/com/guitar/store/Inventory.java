package com.guitar.store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<>();
		addGuitar();
	}

	public void addGuitar() {
		GuitarSpec gs1 = new GuitarSpec("m1", Builder.COLLINGS, Type.ACOUSTIC, Wood.ALDER, Wood.ADIRONDACK, 10);
		GuitarSpec gs2 = new GuitarSpec("m2", Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.ADIRONDACK, 11);
		GuitarSpec gs3 = new GuitarSpec("m3", Builder.FENDER, Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD, 12);
		GuitarSpec gs4 = new GuitarSpec("m4", Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ADIRONDACK, 10);
		GuitarSpec gs5 = new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
		GuitarSpec gs6 = new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

		guitars.add(new Guitar("123", 200, gs1));
		guitars.add(new Guitar("234", 300, gs2));
		guitars.add(new Guitar("345", 400, gs3));
		guitars.add(new Guitar("456", 500, gs4));
		guitars.add(new Guitar("567", 600, gs5));
		guitars.add(new Guitar("678", 700, gs6));

	}

	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSpec().matches(searchGuitar)) {
				matchingGuitars.add(guitar);
			}

		}
		return matchingGuitars;
	}

	public Guitar getGuitar() {
		return null;
	}
}
