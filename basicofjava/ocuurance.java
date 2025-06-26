import java.util.*;
public class ocuurance{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number:");
            long num=sc.nextLong();
            System.out.println("enter the digit of which occurance check");
            int n=sc.nextInt();
            int count = 0;

            //By cnverting to string and then iterate through each char 

            String str=Long.toString(num);
            
           
            for (int i=0;i<str.length();i++){
                int digit =Character.getNumericValue(str.charAt(i));
                if (digit==n){
                    count++;
                }


            }
            System.out.println(count);

            //by using remainder logic

            while(num>0){
                long rem =num%10;
                if (rem==n){
                    count++;
                    
                }
                num = num / 10;
                
                   
            }
            System.out.println(count);
            sc.close();

    }
}