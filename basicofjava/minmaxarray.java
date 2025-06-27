import java.util.*;
public class minmaxarray{
public static void main(String[] args){
    int[] arr={11, 22, 33, 55, 44, 33, 21, 66, 87, 64, 23};
    int maxans=max(arr);
    System.out.println(maxans);

    int minans = min(arr);
    System.out.println(minans);
    

}
static int max(int[] arr){
    if(arr==null||arr.length==0){
        return Integer.MAX_VALUE;
    }
    int maxval = arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>maxval)
        maxval=arr[i];
        
    }
    return maxval;
}

    static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int minval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
            }

        }
        return minval;
    }
}