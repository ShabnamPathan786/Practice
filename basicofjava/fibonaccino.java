import java.util.*;
// find nth fibonacci number where first 2 numbers are a and b 
public class fibonaccino{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("enter first number of series");
        int a=sc.nextInt();
        System.out.println("enter second  number of series");
        int b = sc.nextInt();
        //using for loop
        for(int i=2;i<=n;i++){
            int temp=b;
            b=b+a;
            a=temp;
        }
        System.out.println("the "+n+"th fibonacci number is "+b);


        //using while loop
        int c=2;
        while(c<=n){
            int temp = b;
            b=b+a;
            a=temp; 
            c++;
        }
        System.out.println("the " + n + "th fibonacci number is " + b);


        

    } 
}


