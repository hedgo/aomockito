package com.hedgo.mockito.model;

public class Product {
	
	int amout;
	String desc;	
	
	public Product(int amount, String desc)
	{
		this.amout=amount;
		this.desc=desc;
	}
	
	public int getAmout() {
		return amout;
	}
	public void setAmout(int amout) {
		this.amout = amout;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
