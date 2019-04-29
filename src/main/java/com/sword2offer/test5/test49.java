/**
 * ʵ��һ������stringToInt,ʵ�ְ��ַ���ת��������������ܣ�
 * ����ʹ��atoi�����������ƵĿ⺯����
 */
package com.sword2offer.test5;

public class test49 {

	/**
	 * @param args
	 */

	public static void beforeChange(String str) {

		if (str == null || str.length() < 1) {
			throw new IllegalArgumentException("�Ƿ�����");
		}
		char c = str.charAt(0);

		if (c == '+') {

			change(str, 1, true);
		} else if (c == '-') {
			change(str, 1, false);

		} else if (c >= '0' || c <= '9') {
			change(str, 0, true);
		} else {
			throw new IllegalArgumentException("�Ƿ�����");
		}

	}

	public static void change(String str, int start, boolean flag) {

		int index = start;
		long result = 0;

		for (int i = start; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				result = result * 10 + str.charAt(i) - '0';
				
			} else {
				throw new IllegalArgumentException("�Ƿ�����");
			}
		}
		
		if (flag == false) {
			if(result>0x80000000L){
				throw new NumberFormatException(result+"������ʾ��Χ");
			}else{
				result=0-result;
			}
		}
		
		if(result>0x7FFFFFFFL){
			throw new NumberFormatException(result+"������ʾ��Χ");
		}
		
		
		
		System.out.println(result);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		beforeChange(str);
		

	}

}
