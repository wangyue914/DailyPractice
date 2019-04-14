/**
 * ʵ��SStudent�࣬���ܹ���������
 */
package com.JL;

import java.util.*;

class SStudent implements Comparable<SStudent>{		//ʵ��Comparable�ӿڷ�������
	
	int id;
	String name;
	double score;
	public SStudent(int id,String name,double score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	
	public String toString(){
		return id+name+score;
	}

	public int getId() {
		return id;
	}

	public double getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
	
	//��дcompareTo����
	public int compareTo(SStudent s){
		
		if(this.id>s.getId()){
			return 1;
		}
		else if(this.id<s.getId()){
			return -1;
		}
		else{
			if(this.score>s.getScore()){
				return -1;
			}
			else if(this.score<s.getScore()){
				return 1;
			}
			else {
				return 0;
			}
			
		}
		
		
	}

	
}

public class DemoFor13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<SStudent> stu=new ArrayList<SStudent>();
		SStudent student1=new SStudent(45,"jack",88);
		SStudent student2=new SStudent(23,"jane",60);
		SStudent student3=new SStudent(89,"key",90);
		
		stu.add(student1);
		stu.add(student2);
		stu.add(student3);
		
		Iterator<SStudent> ite=stu.iterator();
		while(ite.hasNext()){
			SStudent temp=ite.next();
			System.out.print(temp.getId()+temp.getName()+temp.getScore()+"\n");
		}
		
		//��stu�е�����SStudent�����������
		Collections.sort(stu);
		
		ite=stu.iterator();
		while(ite.hasNext()){
			SStudent temp=ite.next();
			System.out.print(temp.getId()+temp.getName()+temp.getScore()+"\n");
		}

	}

}
