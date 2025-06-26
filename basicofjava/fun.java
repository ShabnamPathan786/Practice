// import java.util.*;


public class fun{
    public static void main(String[] args) {
        String name="rahul";
        String abc=myGreet(name);

        System.out.println(abc);
        System.out.println(name);
    }

    static String myGreet(String naam) {
        System.out.println("hello "+naam);
        naam="kuunal";
        return naam;
    }
}
