//when you have array range from 1 to N use cyclic sort

import java.util.*;
public class CyclicSort{
    public static void main(String[] args){
        int[] arr = {2, 1
        , 6,4, 5, 7, 3, 8, 9};
        int[] sorted = sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    static int[] sort(int[] arr){
            for(int i=0;i<arr.length;i++){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp=arr[correct];
                    arr[correct]=arr[i];
                    arr[i]=temp;

                }
                
            }
            return arr;
    }
}