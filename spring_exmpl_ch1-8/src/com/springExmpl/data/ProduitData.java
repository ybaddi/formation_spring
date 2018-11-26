package com.springExmpl.data;

import com.springExmpl.idata.IData;

import java.util.Date;

import javax.annotation.PostConstruct;

public class ProduitData implements IData{
	
	private int code;
	private String name;
	private double price;
	private Date creationDate;
	
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
	
	
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public double computePrice() {
		// TODO Auto-generated method stub
		return (5.5);
	}
	@Override
	public void initData() {
		System.out.println("init methode Produit");
		this.code=1;
		this.name="new produit";
		this.price=10.10;
		
	}
	
	@PostConstruct
	public void initDataAnnotation() {
		System.out.println("init methode Produit by annotation");
		this.code=1;
		this.name="new produit";
		this.price=10.10;
		
	}
	
	@Override
	public void destroyData() {
		System.out.println("destroy methode Produit");
		
	}
	
	

}
