import java.util.*;
public class insertionsort{
    public static void main(String[] args) {
        int[] arr={1,2,6,5,7,3,8,9};
        int[] sorted=sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
           int key=arr[i];
           int j=i-1;
            while(j>0 && arr[j]>key){
                
                   arr[j+1]=arr[j];
                   j=j-1;
                
               
                 }
            arr[j+1]=key;
        }
        return arr;
    }
}