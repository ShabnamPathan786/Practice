
import java.util.*;

public class orderagnostic {

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,5,3,2,1,0,-1};
        int target = 7;

        int start = 0;
        int end = arr.length - 1;

        int ans = search(arr, target, start, end);
        System.out.println("the target found at the index" + ans);

    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        
        boolean isAce = arr[0] < arr[arr.length - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAce) {
                 if(target<arr[mid])
            end = mid - 1;
            else
            start = mid + 1;
            }

            if (!isAce) {
                 if(target<arr[mid])
        start=mid+1;
           else
           end = mid - 1;
            }

        }
        return -1;

    }

}
