package com.Graph;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;
import javafx.scene.transform.MatrixType;

import java.util.Stack;

/**
 * Created by Yue on 2017/7/7 0007.
 */
public class AdjGraph {
    public int vertexNum;
    public int []edgeNum=new int[1];
    public int []mark=new int[vertexNum];
    public int[][] matrix;
    public AdjGraph(){}
    public AdjGraph(int vertexNum){
        this.vertexNum=vertexNum;
        matrix=new int[vertexNum][vertexNum];
    }

    public static boolean IsEdge(Edge oneEdge){
        if(oneEdge.weight>0&&oneEdge.end>=0){
            return true;
        }
        return false;

    }
    //返回顶点为vertex的第一条边
    public static Edge firstEdge(int vertex,int vertexNum,int[][] matrix){
        Edge temp=new Edge();
        temp.start=vertex;
        for(int i=0;i<vertexNum;i++){
            if(matrix[vertex][i]!=0){
                temp.end=i;
                temp.weight=matrix[vertex][i];
            }
        }
        return temp;
    }

    //返回与oneEdge有相同起始点的下一条边
    public static Edge nextEdge(Edge oneEdge,int [][]matrix){
        Edge temp=new Edge();
        int vertexNum=matrix.length;
        for(int i=oneEdge.end+1;i<vertexNum;i++){
            if(matrix[oneEdge.start][i]!=0){
                temp.start=oneEdge.start;
                temp.end=i;
                temp.weight=matrix[oneEdge.start][i];
            }
        }
        return temp;
    }
    //增加一条边
    public static void setEdge(int [][]matrix,int start,int end,int weight,int[] edgeNum){
        if(matrix[start][end]==0){
            edgeNum[0]++;
        }
        matrix[start][end]=weight;
    }
    //删除一条边
    public static void delEdge(int [][]matrix,int start,int end,int[] edgeNum){
        if(matrix[start][end]!=0){
            edgeNum[0]--;
        }
        matrix[start][end]=0;
    }



    //深度优先搜索非递归遍历
    public static void DFSNoReverse(int []mark,int vertexNum, int [][]matrix){
        int i,v,u;
        Stack<Integer> stack=new Stack<>();
        for(i=0;i<matrix.length;i++){
            if(mark[i]==0){
                stack.push(i);
                System.out.println(i);
                mark[i]=1;
                while (!stack.isEmpty()){
                    v= stack.pop();
                    for(Edge e=firstEdge(v,vertexNum,matrix);IsEdge(e);e=nextEdge(e,matrix)){
                        u=e.end;
                        if(mark[u]==0){
                            stack.push(u);
                            System.out.println(i);
                            mark[u]=1;
                        }
                    }
                }
            }
        }

    }


}
