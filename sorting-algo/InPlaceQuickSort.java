import java.util.*;
public class InPlaceQuickSort {

    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;                  //it will track blank places 
        for(int j=low;j<high;j++){   //here we handle pivot after loop so loop until  j<high
                if(arr[j]<pivot){
                    i++;
                    swap(arr,i,j);
                }
        }
        i++;
        swap(arr,i,high);    //swap pivot with arr[i];
        return i;
    }
    static  void swap(int[] arr,int f,int s){
            int temp=arr[f];
            arr[f]=arr[s];
            arr[s]=temp;


    }
    static void sort(int[] arr,int low,int high){
            if(low<high){
                int pi=partition(arr,low,high);

                sort(arr,low,pi-1);
                sort(arr,pi+1,high);
            }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4,6};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
