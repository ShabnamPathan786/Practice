
import java.util.Arrays;

public class bubble{
    public static void main(String[] args){
        int arr[]={9,7,6,5,4,3,2,1};
         int[] sorted=new int[arr.length];
        sorted=bubblesort(arr);
        System.out.println(Arrays.toString(sorted));

    }
    static int[] bubblesort(int[] arr){
        int[] newarr=Arrays.copyOf(arr,arr.length);
          for(int i=0;i<newarr.length-1;i++)  {
             boolean isswap=false;
            for(int j=0;j<newarr.length-1-i;j++){
                    if(newarr[j]>newarr[j+1]){
                        int temp=newarr[j];
                        newarr[j]=newarr[j+1];
                        newarr[j+1]=temp;
                        isswap=true;

                    }
            }
              if (!isswap) {
                  return newarr;
              }
          }
          
         return newarr;

    }


    
}