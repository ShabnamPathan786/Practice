import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,8,9,7,7};

        System.out.println(find(arr,0,7));

        int ans=findindex(arr,0,7);
        System.out.println(ans);

        int ans2=findindexLast(arr,arr.length-1,7);
        System.out.println(ans2);

        ArrayList<Integer> list=findAllIndex(arr, 0,7,new ArrayList<>());
        System.out.println(list);
        
    }
    static boolean find(int[] arr,int index, int target){
        if(index==arr.length){
            return false;
        }
        return  arr[index]==target || find(arr,index+1,target);
    }


    static int findindex(int[] arr,int index, int target){
         if(index==arr.length){
            return -1;
        }
        else if(arr[index]==target){
            return index;
        }
        else{
           return findindex(arr,index+1,target);
        }
    }

    static int findindexLast(int[] arr,int index, int target){
         if(index<0){
            return -1;
        }
        else if(arr[index]==target){
            return index;
        }
        else{
           return findindex(arr,index-1,target);
        }
    }


    static ArrayList<Integer> findAllIndex(int[] arr,int index, int target,ArrayList<Integer> l){
        if(index==arr.length){
            return l;
        }
        if(arr[index]==target){
            l.add(index);
        }
        
        return findAllIndex(arr,index+1,target,l);
        
    }
}
