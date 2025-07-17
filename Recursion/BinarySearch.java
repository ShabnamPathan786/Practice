import java.util.*;
public class BinarySearch{
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67,78,89,90};
        int s=0;
        int e=arr.length-1;
        int target=122;
        System.out.println(search(arr,target,s,e));
    
}
static int search(int[] arr,int target,int s,int e){
    int mid=s+(e-s)/2;
    if(s>e){
        return -1;
    }
    else 
    if(target==arr[mid]){
        return mid;
    }
    else if(target<arr[mid]){
       return search(arr,target,s,mid-1);
    }
    else{
     return search(arr,target,mid+1,e);
    }


}

}
