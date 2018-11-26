package com.springExmpl.presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.ExecutorCompletionService;

import com.springExmpl.data.ServiceData;
import com.springExmpl.data.produitData;
import com.springExmpl.idata.IData;
import com.springExmpl.metier.entrepriseMetier;
import com.springExmpl.imetier.IMetier;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IData produitData = new produitData();
		try {
		File file = new File("src/config.properities");
		Scanner scanner = new Scanner(file);
		String dataClassName = scanner.next();
		String metierClassName = scanner.next();
		System.out.println(dataClassName);
		System.out.println(metierClassName);
		
		Class IMETIER = Class.forName(metierClassName);
		IMetier iMetier = (IMetier)IMETIER.newInstance();
		
		Class IDATA = Class.forName(dataClassName);
		IData iData = (IData)IDATA.newInstance();
		
		Method methode = 
				IMETIER.getMethod("setiData", new Class[] {IData.class});
		
		methode.invoke(iMetier, new Object[] {iData});
		
		iMetier.calculePrice();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
