package com.guitar.store;

public enum Builder {

	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	public String toString(){
		switch(this){
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "gibson";
		case COLLINGS:
			return "Collings";
		case OLSON:
			return "Olson";
		case RYAN:
			return "ryan";
		case PRS:
			return "Prs";
			
		default: return "GIBSON";
		}
	}
}
