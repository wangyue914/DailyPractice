/**
 * Map输出的标准操作流程
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
		
		//指定Set集合的类型并将其用Map接口实例化，即将Map接口变为Set
		Set<Map.Entry<String, String>> allset=map.entrySet();
		
		//实例化Iterator对象，用于下面的迭代输出
		Iterator<Map.Entry<String,String>> ite=allset.iterator();
		while(ite.hasNext()){
			
			Map.Entry<String, String> temp=ite.next();
			System.out.print(temp.getKey()+"-"+temp.getValue()+" ");
		}

	}

}
