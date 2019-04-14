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
		
		//1.建立factory用于取得builder
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		
		//2.通过DocumenrBuilderFactory取得DocumentBuilder
		DocumentBuilder builder=null;
		
		try {
			builder=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.定义Document接口对象，通过Document类进行DOM树的转换操作
		Document doc=null;
		
		try {
			//读取指定位置xml文件
			doc=builder.parse("E:"+File.pathSeparator+"demo.xml");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4.查找name节点
		NodeList nl=doc.getElementsByTagName("name");
		
		//5.输出第一个子节点中文本节点的内容
		//item()根据索引查找节点位置
		System.out.println("姓名："+nl.item(0).getFirstChild().getNodeValue());

	}

}
