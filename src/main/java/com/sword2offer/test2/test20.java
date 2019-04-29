package com.sword2offer.test2;

import java.util.ArrayList;

/**
 * Created by Yue on 2017/6/23 0023.
 */
public class test20 {
    public static ArrayList<Integer> printMatrix(int [][] matrix){

        int row= matrix.length;
        int col=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        int x=0;
        int y=0;
        while(x*2<row&&y*2<col){
            printOne(matrix,list,x,y);
            System.out.println("");
            x++;
            y++;
        }
        return list;
    }
    public static void printOne(int [][]matrix,ArrayList list,int x,int y){
        for(int i=y;i<matrix[0].length-y;i++){
            list.add(matrix[x][i]);
        }
        if(matrix.length-x>x+1){
            for(int i=x+1;i<matrix.length-x;i++){
                list.add(matrix[i][matrix[0].length-y-1]);
            }
        }
        if(matrix.length-x>x+1&&matrix[0].length-y>y+1){
            for(int i=matrix[0].length-y-2;i>=y;i--){
                list.add(matrix[matrix.length-x-1][i]);
            }
        }
        if(matrix.length-x>x+2&&matrix[0].length-y-y>1){
            for(int i=matrix.length-x-2;i>x;i--){
                list.add(matrix[i][y]);
            }
        }

    }

    public static void main(String[] args) {
        int [][]nums={{1, 2,},
                {3,4},
                {5,6},
                {7,8},
                {9,10},};
        ArrayList list=printMatrix(nums);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
