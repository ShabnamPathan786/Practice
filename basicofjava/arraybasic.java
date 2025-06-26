import java.util.*;
public class arraybasic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int[] arr=new int[6];

        //directly you can 
        int[]arr1={1,2,3,4,5,6};
        
        
        String[] arr2=new String[4];
        System.out.println(Arrays.toString(arr2)); 
        //gives null which is special type of literals only assign to non-primptive.

        arr2[2]="shabyaa";
        System.out.println(Arrays.toString(arr2));

        //input and ouput for 1D Array
        int[] arr1D=new int[5];
        for(int i=0;i<arr1D.length;i++){
              arr1D[i]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr1D));
        //or


        // for (int i = 0; i < arr1D.length; i++) {
        //     System.out.print(arr1D[i]+" ");
        // }

        //or using Enhanced for loop

        for(int num:arr1D){
            System.out.print(num+" ");
        }




  }

}