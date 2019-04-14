/**
 * ���ַ������ҳ���һ��ֻ����һ�ε��ַ���

 */
package com.ToOffer.test4;

public class test35 {

	/**
	 * @param args
	 */
	
	public static void findFirstOne(String str){
		
		if(str==null){
			throw new IllegalArgumentException("�������");
		}
		
		char c[]=new char[256];
		for(int i=0;i<str.length();i++){
			c[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++){
			if(c[str.charAt(i)]==1){
				//System.out.println(str.charAt(i));
				break;
			}
			else if(i==str.length()-1){
				System.out.println("notfound");
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findFirstOne("abcdefg");

	}

}
