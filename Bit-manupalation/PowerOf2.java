import java.util.*;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=0;  //exception for 0 fix for it
        System.out.println(find(n));
        
    }
    static boolean find(int n){
        if(n==0){
            return false;
        }else
        return (n&(n-1))==0;

    }
    
}
