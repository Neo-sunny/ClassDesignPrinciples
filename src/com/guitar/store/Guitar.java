package com.guitar.store;

public class Guitar {
	private String serialNumber;
	private double price;
	private String model;
	private Builder builder;
	private Type type;
	private Wood backwood;
	private Wood topwood;

	public Guitar(String serialNumber, double price, String model, Builder builder, Type type, Wood backwood,
			Wood topwood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", price=" + price + ", model=" + model + ", builder=" + builder
				+ ", type=" + type + ", backwood=" + backwood + ", topwood=" + topwood + "]";
	}
	
	
}
