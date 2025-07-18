//Amezon question calculate the nth magic no. read concept from book
import java.util.*;
public class MagicNo{
    public static void main(String[] args) {
        int n=6;  //find 6th magic no
        System.out.println(find(n));
        
    }
    static int find(int n){
        int loop=(int)(Math.log(n)/Math.log(2))+1;
        int ans=0;
        int base=5;
        while(loop>0){
            int last=n&1;
            ans+=last*base;
            n=n>>1;
            base=base*5;
            loop-=1;

        }
        return ans;
    }

    
}