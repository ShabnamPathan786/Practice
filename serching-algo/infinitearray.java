//amazon internview question  [ return the first pisition of target in sorted infinite array]
import java.util.*;
public class infinitearray{
    public static void main(String[] args){
            int[] arr={1,2,3,4,5,6,7,8,9,11,433,566,755,889};
             int ans=findRange(arr, 1);
            System.out.println(ans);

    }
    static int findRange(int[] arr,int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr ,int target,int start,int end){
        while (start <= end) {
            // int mid = (start + end) / 2;
            //if (start+end) is too large ineger overflow occure
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; 
            }else if (arr[mid] < target) {
                start = mid + 1; 
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}