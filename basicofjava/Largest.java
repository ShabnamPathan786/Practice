import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class Largest {
        public static void main (String[] args){
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a>b &&  a>c)
        System.out.println("a is largest");
       else if(b>c)
        System.out.println("b is largest");
       else
        System.out.println("c is largest");
        

    }
}