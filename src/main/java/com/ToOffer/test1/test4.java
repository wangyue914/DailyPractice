/**
 * ��ʵ��һ�����������ַ����е�ÿ���ո��滻��"%20"�����硰We are happy.�����������We%20are%20happy.��
 */
package com.ToOffer.test1;

import java.util.ArrayList;





public class test4 {
	
	
public static void change(String str){
	
	int count=0;
	int pastlen=str.length();
	int newlen;
	
	
	char []strarr=new char[50];   // ���ﶨ��һ����������ֹ���������Խ������
	char[]s=str.toCharArray();
	for(int i=0;i<str.length();i++){
		strarr[i]=s[i];
	}
	
	for(int i=0;i<pastlen;i++){
		if(strarr[i]==' '){
		count++;
	}
	}
	newlen=pastlen+2*count;
	
	newlen--;
	pastlen--;
	//System.out.println("last is"+ strarr[newlen]);
	for(int i=pastlen;i>=0;i--){
		if(strarr[i]==' '){
			strarr[newlen--]='0';
			strarr[newlen--]='2';
			strarr[newlen--]='%';
		} 
		else {
		strarr[newlen--]=strarr[i];  //ע������Խ������
		
		}
		
		
	}
	
	System.out.println(String.valueOf(strarr));
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="we are happy";
		change(str);

	}

}
