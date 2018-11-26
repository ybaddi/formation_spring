package com.springExmpl.presentation;

import com.springExmpl.data.ServiceData;
import com.springExmpl.data.produitData;
import com.springExmpl.idata.IData;
import com.springExmpl.metier.entrepriseMetier;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IData produitData = new produitData();
		
		IData produitData = new ServiceData();
		
		entrepriseMetier entrepriseMetier = new entrepriseMetier();

		entrepriseMetier.setiData(produitData);
		
		entrepriseMetier.calculePrice();
	}

}
