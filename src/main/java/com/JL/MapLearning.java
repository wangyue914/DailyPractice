/**
 * Map����ı�׼��������
 */
package com.JL;

import java.util.*;

public class MapLearning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("as", "wang");
		map.put("bq","zhao");
		map.put("cw", "sun");
		
		//ָ��Set���ϵ����Ͳ�������Map�ӿ�ʵ����������Map�ӿڱ�ΪSet
		Set<Map.Entry<String, String>> allset=map.entrySet();
		
		//ʵ����Iterator������������ĵ������
		Iterator<Map.Entry<String,String>> ite=allset.iterator();
		while(ite.hasNext()){
			
			Map.Entry<String, String> temp=ite.next();
			System.out.print(temp.getKey()+"-"+temp.getValue()+" ");
		}

	}

}
