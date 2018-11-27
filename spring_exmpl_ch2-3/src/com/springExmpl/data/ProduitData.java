package com.springExmpl.data;

import com.springExmpl.idata.IData;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;

public class ProduitData implements IData{
	
	private int id;
	private String name;
	private double price;
	private Date creationDate;
	private String chaine;
	private double double1;
	private float reel;
	private boolean booleen;
	private char caractere;
	private java.util.Properties proprietes; 
	private java.util.Locale localisation; 
	private java.net.URL url;
	private java.io.File fichier; 
	private java.lang.Class classe; 
	private byte[] tab2bytes; 
	private String[] tab2chaines;
	private Map<String,String> mapPiece;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getChaine() {
		return chaine;
	}
	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	
	
	
	public double getDouble1() {
		return double1;
	}
	public void setDouble1(double double1) {
		this.double1 = double1;
	}
	public float getReel() {
		return reel;
	}
	public void setReel(float reel) {
		this.reel = reel;
	}
	public boolean isBooleen() {
		return booleen;
	}
	public void setBooleen(boolean booleen) {
		this.booleen = booleen;
	}
	public char getCaractere() {
		return caractere;
	}
	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}
	public java.util.Properties getProprietes() {
		return proprietes;
	}
	public void setProprietes(java.util.Properties proprietes) {
		this.proprietes = proprietes;
	}
	public java.util.Locale getLocalisation() {
		return localisation;
	}
	public void setLocalisation(java.util.Locale localisation) {
		this.localisation = localisation;
	}
	public java.net.URL getUrl() {
		return url;
	}
	public void setUrl(java.net.URL url) {
		this.url = url;
	}
	public java.io.File getFichier() {
		return fichier;
	}
	public void setFichier(java.io.File fichier) {
		this.fichier = fichier;
	}
	public java.lang.Class getClasse() {
		return classe;
	}
	public void setClasse(java.lang.Class classe) {
		this.classe = classe;
	}
	public byte[] getTab2bytes() {
		return tab2bytes;
	}
	public void setTab2bytes(byte[] tab2bytes) {
		this.tab2bytes = tab2bytes;
	}
	public String[] getTab2chaines() {
		return tab2chaines;
	}
	public void setTab2chaines(String[] tab2chaines) {
		this.tab2chaines = tab2chaines;
	}
	
	
	public Map<String, String> getMapPiece() {
		return mapPiece;
	}
	public void setMapPiece(Map<String, String> mapPiece) {
		this.mapPiece = mapPiece;
	}
	@Override
	public double computePrice() {
		// TODO Auto-generated method stub
		return (5.5);
	}
	@Override
	public void initData() {
		System.out.println("init methode Produit");
		this.id=1;
		this.name="new produit";
		this.price=10.10;
		
	}
	
	@PostConstruct
	public void initDataAnnotation() {
		System.out.println("init methode Produit by annotation");
		this.id=1;
		this.name="new produit";
		this.price=10.10;
		
	}
	
	@Override
	public void destroyData() {
		System.out.println("destroy methode Produit");
		
	}
	@Override
	public String toString() {
		return "ProduitData [id=" + id + ", name=" + name + ", price=" + price + ", creationDate=" + creationDate
				+ ", chaine=" + chaine + ", entier=" + double1 + ", reel=" + reel + ", booleen=" + booleen
				+ ", caractere=" + caractere + ", proprietes=" + proprietes + ", localisation=" + localisation
				+ ", url=" + url + ", fichier=" + fichier + ", classe=" + classe + ", tab2bytes="
				+ Arrays.toString(tab2bytes) + ", tab2chaines=" + Arrays.toString(tab2chaines) + "]";
	}
	
	
	
	
	
	
	public ProduitData(int id, String name, Map<String, String> mapPiece) {
		super();
		this.id = id;
		this.name = name;
		this.mapPiece = mapPiece;
	}
	
	public ProduitData(int id, String name, double price, Date creationDate, String chaine, double double1, float reel,
			boolean booleen, char caractere, Properties proprietes, Locale localisation, URL url, File fichier,
			Class classe, byte[] tab2bytes, String[] tab2chaines) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.creationDate = creationDate;
		this.chaine = chaine;
		this.double1 = double1;
		this.reel = reel;
		this.booleen = booleen;
		this.caractere = caractere;
		this.proprietes = proprietes;
		this.localisation = localisation;
		this.url = url;
		this.fichier = fichier;
		this.classe = classe;
		this.tab2bytes = tab2bytes;
		this.tab2chaines = tab2chaines;
	}
	
	
	
	

}
