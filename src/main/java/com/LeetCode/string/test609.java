package com.LeetCode.string;

import java.util.*;

/**
 * Created by Yue on 2017/6/11 0011.
 */
public class test609 {
    public static List<List<String>> findDuplicate(String[] paths) {

        List <List<String>> list=new ArrayList<>();
        Map<String,Set<String>> map=new HashMap<>();
        for(String str:paths){
            String file[]=str.split("\\s+");   //以任意长度空串作为分割符将每个文件内容和路径进行拆分
            for(int i=1;i<file.length;i++){  //file[0]固定为文件的路径
                int index=file[i].indexOf('(');
                String content=file[i].substring(index); //获取文件内容
                String filename=file[0]+"/"+file[i].substring(0,index); //获取该文件具体目录，包含文件名
                Set<String> filenames=map.getOrDefault(content,new HashSet<String>()); //jdk1.8新增函数，找到k对应的值则返回正确的值否则返回后面的默认值
                filenames.add(filename); //具有相同文件内容的文件集合
                map.put(content,filenames);  //将具有相同文件内容的集合放入map
            }
        }
        for(String k:map.keySet()){
            if(map.get(k).size()>1){
                list.add(new ArrayList<>(map.get(k)));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String []paths={"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<List<String>> result=findDuplicate(paths);
        for(List<String> list:result){
            for(String str:list){
                System.out.println("*"+str+"* ");
            }
            System.out.println(" ");
        }
    }
}
