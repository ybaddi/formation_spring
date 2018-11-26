package com.springExmpl.presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.ExecutorCompletionService;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

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
		File file = new File("src/config.xml");
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbfactory.newDocumentBuilder();
		Document doc = dbBuilder.parse(file);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("ROOT element : " + doc.getDocumentElement().getTextContent());
		
		
		Node dataclassNode = doc.getElementsByTagName("data").item(0);
		
		Node metierclassNode = doc.getElementsByTagName("metier").item(0);
		
		
		
		
		String dataClassName = dataclassNode.getTextContent();
		String metierClassName = metierclassNode.getTextContent();
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

