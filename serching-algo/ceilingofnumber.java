//find the ceiling of the number 
//it is smallest number from array greater then or equal to targrt

import java.util.*;
public class ceilingofnumber{
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8};
        int target=0;
        //output should be 6;or index =4;

        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr,int target){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid])
                return arr[mid];
                else if(target<arr[mid])
                end=mid-1;
                else
                start=mid+1;
            }
        //     if(start<arr.length){      //if the target is gretest of all
        //    return arr[start];
        //    }
        //    return -1;

        //for floor of number that is gretest number smaller than or equal to the target
        if(end>=0){
            return arr[end];
        }
        return -1;
    }
}