import java.nio.channels.AsynchronousCloseException;
import java.util.*;
public class BasicOfString{   
public static void main(String[] args){
   
    System.out.println(56);  
    System.out.println("shabnam");
    System.out.println(new ArrayList<>());
    System.out.println(Arrays.toString(new int[]{})); 

    //here whatever datatype you passed the println method call valueOf method then valueOf call to t
    //toString then this method convert it to string and print;


    System.out.println("a"+"b");  //concatenation of two string ...   here operator s overloaded java doesnot supoort operator overloading but here is exception with string also can be valid for complex object only and only if the one value should string data type .

      System.out.println((char)('a'+3)); //print d here
        System.out.println("a" + 3);
        //after few steps it will convert to "a" + "3"
        //integer convert to Integer and then it call to to String


      String ans=new ArrayList<>() + "shabnam " + new Integer(56);   
      System.out.println(ans);       //one should be string
   

   }
}