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
		
		//单向迭代输出，从前往后
		/*Iterator<String> ite1=arr.iterator();
		while(ite1.hasNext()){
			System.out.print(ite1.next()+" ");
		}
		
		System.out.println(" ");
		//双向迭代输出
		ListIterator <String> ite2 =arr.listIterator();  
		while(ite2.hasNext()){
			System.out.print(ite2.next()+" ");
		}
		System.out.println(" ");
		
		//注意，从后往前输出时必须先从前往后输出
		while(ite2.hasPrevious()){
			System.out.print(ite2.previous()+" ");
		}
		System.out.println(" ");
		
		//使用foreach输出
		for(String str : arr){
			System.out.print(str+" ");
		}
		*/
		
		
		//关于map的输出,注意：Hashmap不保证映射的顺序
		Map<String, String> map=new HashMap<String,String>();
		map.put("qwe", "QQQ");
		map.put("fdg", "www");
		map.put("32", "eee");
		
		Set<String> keys=map.keySet();
		
		//输出全部key值
		Iterator<String> ite1=keys.iterator();
		while(ite1.hasNext()){
			String str=ite1.next();
			System.out.print(str+" ");
			
		}
		System.out.println();
		
		//输出全部value
		Collection<String> val=map.values();
		Iterator<String> ite2=val.iterator();
		while(ite2.hasNext()){
			System.out.print(ite2.next()+" ");
		}
		System.out.println();
		
		//Iterator输出map
		Set<Map.Entry<String , String>> allset=map.entrySet();
		Iterator<Map.Entry<String, String>> ite3=allset.iterator();
		while(ite3.hasNext()){
			Map.Entry<String, String> me1=ite3.next();
			System.out.print(me1.getKey()+"->"+me1.getValue()+" ");
		}
		System.out.println();
		
		//foreach输出map
		for(Map.Entry<String, String> me2:map.entrySet()){
			System.out.print(me2.getKey()+"->"+me2.getValue()+" ");
		}
		
		
	
		
		
		
		
		

	}

}
