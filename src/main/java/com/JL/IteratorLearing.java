/**
 * 使用Iterator迭代输出集合中的内容，只要碰到集合集合的输出操作就要用Iteretor接口
 */
package com.JL;

import java.lang.reflect.Array;
import java.util.*;

public class IteratorLearing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr=new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("!");
		
		/*Iterator<String> ite1=arr.iterator();
		while(ite1.hasNext()){
			System.out.print(ite1.next()+" ");
		}
		
		System.out.println(" ");
		ListIterator <String> ite2 =arr.listIterator();
		while(ite2.hasNext()){
			System.out.print(ite2.next()+" ");
		}
		System.out.println(" ");
		
		while(ite2.hasPrevious()){
			System.out.print(ite2.previous()+" ");
		}
		System.out.println(" ");
		
		//ʹ��foreach���
		for(String str : arr){
			System.out.print(str+" ");
		}
		*/
		
		
		Map<String, String> map=new HashMap<String,String>();
		map.put("qwe", "QQQ");
		map.put("fdg", "www");
		map.put("32", "eee");
		
		Set<String> keys=map.keySet();
		
		Iterator<String> ite1=keys.iterator();
		while(ite1.hasNext()){
			String str=ite1.next();
			System.out.print(str+" ");
			
		}
		System.out.println();
		
		Collection<String> val=map.values();
		Iterator<String> ite2=val.iterator();
		while(ite2.hasNext()){
			System.out.print(ite2.next()+" ");
		}
		System.out.println();
		
		Set<Map.Entry<String , String>> allset=map.entrySet();
		Iterator<Map.Entry<String, String>> ite3=allset.iterator();
		while(ite3.hasNext()){
			Map.Entry<String, String> me1=ite3.next();
			System.out.print(me1.getKey()+"->"+me1.getValue()+" ");
		}
		System.out.println();
		
		for(Map.Entry<String, String> me2:map.entrySet()){
			System.out.print(me2.getKey()+"->"+me2.getValue()+" ");
		}
		
		
	
		
		
		
		
		

	}

}
