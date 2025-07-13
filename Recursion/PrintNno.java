import java.util.*;
public class PrintNno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N");
        int n=sc.nextInt();
        print(1,n);

        
    }
    static void print(int k, int n){
        
        if(k<n){
        System.out.println(k);
        print(k+1,n);
    }
    return;
    
}
}
