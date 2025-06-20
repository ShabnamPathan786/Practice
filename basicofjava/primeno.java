import java.util.*;
public class primeno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        String input;
        do{
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num==1){
            isPrime=false;
        }
        else{
            for(int i=2;i*i<num;i++){
                if(num%i==0){
                isPrime=true;
                break;
                }
                
                    
            }
            
        }
        if(isPrime)
            {System.out.println("the number  prime");}
            else{
            System.out.println("the number is not prime");
            }

            System.out.println("press y to check another no");
           input = sc.next();
        }
        while(input.equalsIgnoreCase("y"));
        sc.close();

    }
}