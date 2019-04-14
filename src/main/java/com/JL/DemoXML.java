package com.JL;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DemoXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.����factory����ȡ��builder
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		
		//2.ͨ��DocumenrBuilderFactoryȡ��DocumentBuilder
		DocumentBuilder builder=null;
		
		try {
			builder=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.����Document�ӿڶ���ͨ��Document�����DOM����ת������
		Document doc=null;
		
		try {
			//��ȡָ��λ��xml�ļ�
			doc=builder.parse("E:"+File.pathSeparator+"demo.xml");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4.����name�ڵ�
		NodeList nl=doc.getElementsByTagName("name");
		
		//5.�����һ���ӽڵ����ı��ڵ������
		//item()�����������ҽڵ�λ��
		System.out.println("������"+nl.item(0).getFirstChild().getNodeValue());

	}

}
