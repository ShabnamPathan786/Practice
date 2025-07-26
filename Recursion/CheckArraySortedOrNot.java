public class CheckArraySortedOrNot {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,9,8};
       boolean ans=check(arr,0);
       System.out.println(ans);
    }
   static boolean check(int[] arr,int i){
                if(i>=arr.length-1){
                    return true;
                }
                // else if( arr[i]<arr[i+1]){
                //     return check(arr,i+1);
                // }
                // else{
                //     return false;
                // }


                //or you can direct return 
                return arr[i]<arr[i+1] &&check(arr,i+1);
                

   }
}
