import java.util.*;

public class NoOfDigit {
    public static void main(String[] args) {
        int num=6;
        int base=2;
        System.out.println(find(num,base));
    }
    static int find(int n ,int b){
        return (int)(Math.log(n)/Math.log(b))+1;
    }
    
}
