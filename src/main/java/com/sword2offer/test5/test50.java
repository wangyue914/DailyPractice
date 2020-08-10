/**
 * ����������������͹������ȣ��������Ƕ�����������û��ָ�򸸽ڵ��ָ�롣
 */
package com.sword2offer.test5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test50 {

	/**
	 * @param args
	 */
	public static class TreeNode{
		
		int value;
		List<TreeNode> children=new LinkedList<TreeNode>();
		public TreeNode(){
			
		}
		public TreeNode(int value){
			this.value=value;
		}
		
		@Override
		public String toString(){
			return value+"";
		}
		
	}
	
	public static void getPath(TreeNode root,TreeNode node,List<TreeNode> path){
		
		if(root==null||node==null){
			return;
		}
		
		TreeNode temp=root;
		path.add(temp);
		for(TreeNode i:temp.children){
			
			if(i==node){
				path.add(i);
				return;
			}
			else{
				getPath(i,node,path);
				
			}
			
		}
		
		path.remove(path.size()-1);
		
	}
	
	public static TreeNode findCommonNode(List<TreeNode> path1,List<TreeNode> path2){
		
		if(path1==null||path2==null){
			
			return null;
		}
		
		Iterator<TreeNode> ite1=path1.iterator();
		Iterator<TreeNode> ite2=path2.iterator();
		
		TreeNode last=null;
		while(ite1.hasNext()&&ite2.hasNext()){
			
			TreeNode temp=ite1.next();
			if(temp==ite2.next()){
				
				last= temp;
			}
		}
		
		return last;
	}
	
	public static TreeNode findCommonParentNode(TreeNode root,TreeNode node1,TreeNode node2){
		
		if(root==null||node1==null||node2==null){
			return null;
		}
		
		List<TreeNode> path1=new LinkedList<TreeNode>();
		List<TreeNode> path2=new LinkedList<TreeNode>();
		getPath(root, node1, path1);
		getPath(root, node2, path2);
		
		return findCommonNode(path1, path2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeNode n1 = new TreeNode(1);
	        TreeNode n2 = new TreeNode(2);
	        TreeNode n3 = new TreeNode(3);
	        TreeNode n4 = new TreeNode(4);
	        TreeNode n5 = new TreeNode(5);
	        TreeNode n6 = new TreeNode(6);
	        TreeNode n7 = new TreeNode(7);
	        TreeNode n8 = new TreeNode(8);
	        TreeNode n9 = new TreeNode(9);
	        TreeNode n10 = new TreeNode(10);

	        n1.children.add(n2);
	        n1.children.add(n3);

	        n2.children.add(n4);

	        n4.children.add(n6);
	        n4.children.add(n7);

	        n3.children.add(n5);

	        n5.children.add(n8);
	        n5.children.add(n9);
	        n5.children.add(n10);
	        
	       System.out.println(findCommonParentNode(n1, n6, n4));
	        
	        

	}

}
