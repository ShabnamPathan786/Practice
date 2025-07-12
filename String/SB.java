import java.util.*;
public class SB{
    public static void main(String[] args){
        String result="";
        for(int i=0;i<26;i++){
            char ch =(char)('a'+i);
            result+=ch;
        }
        System.out.println(result);// by using this method the memory is get wested because each time new object is created like a,ab,abc,abcd,..., like that . so the solution is Stringbuilder which create only one object.


         StringBuilder builder=new StringBuilder();
         for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
         }
         System.out.println(builder); //works because println calls toString internally
         System.out.println(builder.toString());//explicitely calls toString method.



    }
}