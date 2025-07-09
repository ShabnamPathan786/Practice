
import java.util.Arrays;

public class bubble{
    public static void main(String[] args){
        int arr[]={12,65,83,43,54,99,11,90};
        int[] sorted=new int[arr.length];
        sorted=bubblesort(arr);
        System.out.println(Arrays.toString(sorted));

    }
    static int[] bubblesort(int[] arr){
          for(int i=0;i<arr.length;i++)  {
            for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
            }
          }
          return arr;
    }


    
}