package com.springExmpl.metier;

import com.springExmpl.data.produitData;
import com.springExmpl.idata.IData;

public class entrepriseMetier {

	private IData iData;

	public IData getiData() {
		return iData;
	}

	public void setiData(IData iData) {
		this.iData = iData;
	}

	public double calculePrice() {
		double priceTTC = iData.computePrice() + (iData.computePrice() * 0.2);
		System.out.println(priceTTC);
		return priceTTC;
	}

}
