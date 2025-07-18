import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        int num=68;
        if((num&1)==1){
            System.out.println("odd");
        }
        else
       { 
        System.out.println("even");
    }
       System.out.println(cal(num));

    }




    static boolean cal(int n){
        return (n&1)==0 ;
    }
    
}
