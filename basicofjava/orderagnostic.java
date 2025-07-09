import java.util.*;
public class orderagnostic{
    public static void main(String[] args){
            int[] arr={263,345,664,746,823,825,899,999};
            int target=746;
            
            int start = 0;
            int end = arr.length - 1;
           
            if (arr[0] < arr[arr.length - 1]) {
                   int ans=acending(arr,target,start,end);
                    System.out.println("the target found at index:" + ans);
        }
          else
          {
            int ans=decending(arr,target,start,end);
         System.out.println("the target found at index:" + ans);
}
    }
     static int acending(int[] arr,int target,int start,int end ){
        if(arr.length==0||arr==null){
                return -1;
        }
                
                
                
                    while(start<=end){
                        
                        int mid = start + (end - start) / 2;

                      if(target==arr[mid])
                      return mid;
                      else if(target<arr[mid])
                    end = mid - 1;
                      else
                     start = mid + 1;
                      

                   
                }
               return -1;

     }
     static int decending(int[] arr, int target, int start, int end) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid; 
            }else if (target < arr[mid]) {
                start=mid+1;
            }else {
                end = mid - 1;
            }

        }
        return -1;
   
    
           
}
}