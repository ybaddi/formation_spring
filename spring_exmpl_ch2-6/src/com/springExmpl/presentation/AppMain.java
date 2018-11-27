package com.springExmpl.presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorCompletionService;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.springExmpl.data.ProduitData;
import com.springExmpl.data.ServiceData;
import com.springExmpl.idata.IData;
import com.springExmpl.metier.EntrepriseMetier;
import com.springExmpl.imetier.IMetier;

public class AppMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext 	 context = new FileSystemXmlApplicationContext("src/config.xml");
		
		IData produitData = (IData)	context.getBean("produitData");
		
		System.out.println(((ProduitData)produitData).toString());
		
		Map<String, String> map = ((ProduitData)produitData).getMapPiece();
		for(Map.Entry<String, String> mapEntry : map.entrySet()) {
			System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		}
		
		List<String> list = ((ProduitData)produitData).getListPiece();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}
		
		
//		System.out.println(((ProduitData)produitData).getChaine().length());
//		IData serviceData = (IData)	context.getBean("serviceData");
//		IData serviceData2 = (IData)	context.getBean("serviceData");

		
		//System.out.println(serviceData.computePrice());
		
//		IMetier iMetier = (IMetier)	context.getBean("entrepriseMetier");
		
//		iMetier.setiData(serviceData);
		
		//System.out.println(serviceData.computePrice());
		
//		System.out.println(serviceData.computePrice());
		
		context.close();
		
	}

}

