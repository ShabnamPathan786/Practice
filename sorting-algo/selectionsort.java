import java.util.*;
public class selectionsort{
    public static void main(String[]  args ){
        int[] arr={8,7,4,5,3,6,9};
        int[] sorted=sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    static int minvalue(int[] arr,int index){
        int min=arr[index];
        for(int i=index;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int[] sort(int[] arr){
            for(int index=0;index<arr.length;index++){
                int minimum=minvalue(arr, index);
               for(int i=index;i<arr.length;i++){
                if(arr[i]==minimum){
                    int temp=arr[index];
                    arr[index]=arr[i];
                    arr[i]=temp;
                }
               }
            }
            return arr;
    }
    
}
