package com.atb.ninja.domain;

public class Data {
	
	private String reference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return reference;
	}

	public Data(String reference) {
		super();
		this.reference = reference;
	}

	public Data() {
		super();
	}
	
	

}
