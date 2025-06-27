import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class binarysearch{
    public static void main (String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter the start of array: ");
        // int start=sc.nextInt();
        // System.out.print("enter the end of array: ");
        // int end=sc.nextInt();
         
        int[] arr={23, 26, 54, 55, 67, 78, 89, 99, 100};
        int target=100;
        int ans=search(arr,0,arr.length-1,target);
        System.out.println(ans);
                
    }
    static int search(int[] arr, int start,int end ,int target){
        if (arr == null || arr.length == 0) {
            return -1;
        }
        while(start<=end){
                // int mid = (start + end) / 2;
                //if (start+end) is too large ineger overflow occure
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                    return mid;
                
                else if(arr[mid]<target)
                start=mid+1;

                else
                end=mid-1;
        }
        return -1;
    }

}