package com.springExmpl.data;

import com.springExmpl.idata.IData;

public class produitData implements IData{
	
	private int code;
	private String name;
	private double price;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public double computePrice() {
		// TODO Auto-generated method stub
		return (5.5);
	}
	
	

}
