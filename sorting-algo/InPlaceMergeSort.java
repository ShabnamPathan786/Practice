import java.util.*;
public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4,6};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void divide(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int mid=start+(end-start)/2;
        divide(arr,start,mid);   //left part
        divide(arr,mid+1,end);   //right part

        conquer(arr,start,mid,end);
        
    }
    static void conquer(int[] arr,int start,int mid,int end){
        int start2=mid+1;

        while(start <= mid && start2 <= end){
            if(arr[start]<arr[start2]){
            start++;
        }
        else{
            int value=arr[start2];  //store  the index and value and shift element between start and   
            int index=start2;       //start2-1 right by one step.
            while(index>start){
                arr[index]=arr[index-1];
                index--;
            }
            arr[start]=value;    //store at correct palce
            start++;             //update all pointers
            mid++;               //mid+1 because mid element shift to right .
            start2++;
        }
        }
        
    }
}
