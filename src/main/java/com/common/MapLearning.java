/**
 * Map输出的标准操作流程
 */
package com.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		Set<Map.Entry<String, String>> allset=map.entrySet();
		
		Iterator<Map.Entry<String,String>> ite=allset.iterator();
		while(ite.hasNext()){
			
			Map.Entry<String, String> temp=ite.next();
			System.out.print(temp.getKey()+"-"+temp.getValue()+" ");
		}

	}

}
