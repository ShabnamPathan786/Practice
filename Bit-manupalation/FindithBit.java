import java.util.*;

public class FindithBit {
    public static void main(String[] args) {
        int num=10;
        int bit=4;//binary no=00001010 find 4th bit of it
        System.out.println(find(num,bit));
    }
    static int find(int n ,int bit){
        int i= (int)(n>>(bit-1)&1);  //using right shift
       // int i=(int)(n&(1<<(bit-1)))>>(bit-1);   //using left shift
        return i;
    }
    
}
