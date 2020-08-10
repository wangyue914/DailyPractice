package com.aboutstring;

import java.util.ArrayList;

public class KMP_suanfa {

	/**
	 * @param args
	 */
	
	public static ArrayList<Integer> beforeMatch(String p){
		int plen=p.length();
		char[]c=p.toCharArray();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		for(int i=1;i<plen;i++){
			int k=list.get(i-1);
			while(k>0&&c[i]!=c[k]){
				k=list.get(k-1);
			}
			if(c[k]==c[i]){
				list.add(k+1);
			}else{
				list.add(0);
			}
		}
		
		return list;
	}
	/**
	 * 
	 * @param target
	 * @param pstr
	 * @param list
	 * @param start
	 * @return
	 */
	public static int KMP_match(String target,String pstr,ArrayList<Integer> list,int start){
		int last=target.length()-pstr.length();
		if(last-start<0){
			return -1;
		}
		char[]t=target.toCharArray();
		char[]p=pstr.toCharArray();
		int j=0;
		for(int i=start;i<target.length();i++){
			while(t[i]!=p[j]&&j>0){
				j=list.get(j-1);
			}
			if(t[i]==p[j]){
				j++;
			}
			if(j==p.length){
				return i-j+1;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=beforeMatch("abaabcac");
		for(int i:list){
			System.out.print(i+" ");
		}
		System.out.println("");
		String target="acabaabaabcacaabc";
		System.out.println(KMP_match(target, "abaabcac", list, 0));

	}

}
