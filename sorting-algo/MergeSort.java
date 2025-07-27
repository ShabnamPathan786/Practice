import java.util.*;
 public class MergeSort {
    public static void main(String[] args) {
        int[] arr={6,4,7,9,3,4,2,1};
        divide(arr);
       System.out.println(Arrays.toString(arr));
        
    }
    static void divide(int[] arr){
        if(arr.length<2){
            return;
        }
        int mid=(arr.length)/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
        divide(left);
        divide(right);

        conquer(arr,left,right);



    }
    static void conquer(int[] arr,int[] left, int[] right){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            arr[k]=right[j];
            k++;
            j++;
        }

    }
}
