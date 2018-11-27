package com.springExmpl.data;

import com.springExmpl.idata.IData;

public class ServiceData implements IData{

	private int code;
	private String name;
	private double price;
	
	public ServiceData() {
		System.out.println("Default Constructor");
	}
	
	

	public ServiceData(int code, String name, double price) {
		System.out.println("Constructor");
		this.code = code;
		this.name = name;
		this.price = price;
	}



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
		return (10.10);
	}

	@Override
	public void initData() {
		System.out.println("init methode Service");
		this.code=1;
		this.name="new produit";
		this.price=10.10;
		
	}



	@Override
	public void destroyData() {
		System.out.println("destroy methode Service");
		
	}

}
