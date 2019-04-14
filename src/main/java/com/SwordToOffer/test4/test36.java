package com.SwordToOffer.test4;

/**
 * Created by Yue on 2017/6/3 0003.
 * 针对数据量太大问题选择对1000000007取余
 */
public class test36 {
    public static int InversePairs(int [] array) {
        if(array==null||array.length<1){
            return 0;
        }
        int []copy=new int [array.length];
        System.arraycopy(array,0,copy,0,array.length);
        return InversePairs(array,copy,0,array.length-1);


    }
    public static int InversePairs(int []array,int []copy,int start,int end){
        if(start>=end){
            return 0;
        }
        int mid=(start+end)/2;
        int left=InversePairs(array,copy,start,mid)%1000000007 ;
        int right=InversePairs(array,copy,mid+1,end)%1000000007 ;
        int count=0;
        int i=mid;
        int j=end;
        int index=end;
        while(i>=start&&j>=mid+1){
            if(array[i]>array[j]){
                count=(count+j-mid) ;
                if(count>=1000000007)//数值过大求余
                {
                    count%=1000000007;
                }
                copy[index]=array[i];
                i--;
                index--;
            }else{
                copy[index]=array[j];
                j--;
                index--;
            }
        }

        while(i>=start){
            copy[index]=array[i];
            index--;
            i--;
        }
        while(j>=mid+1){
            copy[index]=array[j];
            index--;
            j--;
        }
        for(int k=start;k<=end;k++){
            array[k]=copy[k];
            System.out.print(copy[k]+" ");

        }
        System.out.println("");
        return (count+left+right)%1000000007 ;

    }

    public static void main(String[] args) {
        int nums[]={7,5,6,4};
        int num2[]={4, 6, 5, 3, 2, 1};
        int array[]={364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(InversePairs(num2));
    }
}
