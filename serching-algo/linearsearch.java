import java.util.*;
public class linearsearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the target you want find");
        int target = sc.nextInt();
        boolean ans=search(arr,target);
        System.out.println(ans);


    }
    static boolean search(int[] nums,int target){
         if(nums.length==0||nums==null){
             return false;
         }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
            int element=nums[i];
            return true;
            }
        }
        return false;
    }

}



