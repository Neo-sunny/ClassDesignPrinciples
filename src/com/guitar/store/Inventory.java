package com.guitar.store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory(){}
	public void initializeInventory(){
		guitars = new ArrayList<>();
		
		guitars.add(new Guitar("123",200,"m1",Builder.COLLINGS,Type.ACOUSTIC,Wood.ALDER, Wood.ADIRONDACK));
		guitars.add(new Guitar("234",230,"m2",Builder.COLLINGS,Type.ELECTRIC,Wood.ALDER, Wood.ADIRONDACK));
		guitars.add(new Guitar("345",240,"m3",Builder.FENDER,Type.ACOUSTIC,Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD));
		guitars.add(new Guitar("456",400,"m4",Builder.FENDER,Type.ELECTRIC,Wood.CEDAR, Wood.ADIRONDACK));
		guitars.add(new Guitar("567",300,"Stratocastor",Builder.FENDER,Type.ELECTRIC,Wood.ALDER, Wood.ALDER));
		guitars.add(new Guitar("678",500,"Stratocastor",Builder.FENDER,Type.ELECTRIC,Wood.ALDER, Wood.ALDER));
	}
	public void addGuitar() {
	}

	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();

			if (searchGuitar.getBuilder() != guitar.getBuilder())
				continue;

			String model = searchGuitar.getModel();
			if (!model.equals(null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
				continue;
			
			if(searchGuitar.getType() != guitar.getType())
				continue;
			
			if(searchGuitar.getBackwood() != guitar.getBackwood())
				continue;
			
			if(searchGuitar.getTopwood() != guitar.getTopwood())
				continue;
			
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

	public Guitar getGuitar() {
		return null;
	}
}
