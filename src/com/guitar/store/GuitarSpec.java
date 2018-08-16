package com.guitar.store;

public class GuitarSpec {

	private String model;
	private Builder builder;
	private Type type;
	private Wood backwood;
	private Wood topwood;
	private Integer numStrings;

	public GuitarSpec(String model, Builder builder, Type type, Wood backwood, Wood topwood, Integer numStrings) {
		super();
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
		this.numStrings = numStrings;
	}

	public boolean matches(GuitarSpec other) {

		if (getBuilder() != other.getBuilder())
			return false;

		String model = other.getModel();
		if (!model.equals(null) && (!model.equals("")) && (!model.equals(other.getModel())))
			return false;

		if (getType() != other.getType())
			return false;

		if (getBackwood() != other.getBackwood())
			return false;

		if (getTopwood() != other.getTopwood())
			return false;

		return true;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackwood() {
		return backwood;
	}

	public void setBackwood(Wood backwood) {
		this.backwood = backwood;
	}

	public Wood getTopwood() {
		return topwood;
	}

	public void setTopwood(Wood topwood) {
		this.topwood = topwood;
	}

	public Integer getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(Integer numStrings) {
		this.numStrings = numStrings;
	}

}
