package com.guitar.store;

public class GuitarSpec {

	private String model;
	private Builder builder;
	private Type type;
	private Wood backwood;
	private Wood topwood;
	
	public GuitarSpec(String model, Builder builder, Type type, Wood backwood, Wood topwood) {
		super();
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
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
	
	
}
