 import java.util.*;
 public class Palindrome{
    public static void main(String[] args) {
        String let="abab";
        //check if palindrome or not
        char[] arr=let.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(check(arr));


        //using StringBuilder

        StringBuilder str = new StringBuilder();
        str.append("abcdbca");
        String original=str.toString();
        str.reverse();
        String reversed=str.toString();
        if(original.equals(reversed)){
            System.out.println("palindrome");
        }
        else{
            System.out.println(" not palindrome");
        }

        
        
    }
    static boolean check(char[] arr){
       
        for(int i=0;i<=arr.length/2;i++){
            int start=i;
            int end=arr.length-(i+1);
            if(arr[start]!=arr[end]){
                 return false;
            }
            
        }
        return true;

    }

 }
