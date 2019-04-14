/**
 * ��Ŀһ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ְ���˳�򲻱䡣
 * Ϊ������������ź���ͨ��ĸһ������
 * ��Ŀ�����ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β����
 */
package com.ToOffer.test5;

public class test42 {

	/**
	 * @param args
	 */
	
	public static void  reverse(char[]data,int start,int end){
		
		if(data==null||data.length<1||start>end||start<0||end>data.length){
			return;
		}
		
		while(start<end){
			char temp=data[start];
			data[start]=data[end];
			data[end]=temp;
			start++;
			end--;
		}

	}
	
	private static char[] reverseWord(char[]data){
		if(data==null||data.length<1){
			throw new IllegalArgumentException("�Ƿ�����");
		}
		reverse(data,0,data.length-1);
		
		int start=0;
		int end=0;
		while(start<data.length){
			
			if(data[start]==' '){
				start++;
				end++;
			}
			else if(end==data.length||data[end]==' '){
				
				reverse(data,start,end-1);
				end++;
				start=end;
				
			}
			else{
				end++;
			}
			
		}
		return data;
		
	}
	
	
	public static void rotateString(char[]data,int k){
		if(data==null||data.length<1||k>data.length||k<0){
			return;
		}
		reverse(data,0,k-1);
		reverse(data,k,data.length-1);
		reverse(data,0,data.length-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char []data="I am a student.".toCharArray();
		
		
		System.out.print(new String(reverseWord(data)));
		
		System.out.println("");
		char []data2="abcdefg".toCharArray();
		rotateString(data2, 2);
		String s=new String(data2);
		
		System.out.print(s);
		

	}

}
