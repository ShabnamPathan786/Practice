public class check{
    public static void main(String[] args){
        int[] arr={23,657,54,88,8,8945,24};
        int ans=checkeven(arr);
        System.out.println(ans);

        int ans2=checkeven2(arr);
        System.out.println(ans2);

        int ans3=checkeven3(arr);
        System.out.println(ans3);
       

    }
    //by converting to string 
    static int checkeven(int[] arr){
       int count=0; 
       for(int i=0;i<arr.length;i++){
            int element=arr[i];
            String str=Integer.toString(element);
            int len=str.length();
            if(len%2==0){
                count++;
            }
       }
       return count;

       
    }
    //using pure math 
    static int checkeven2(int[] arr) {

            int count=0;
            for(int num:arr){
                int n=num;
                int digit=0;
                while(n>0){
                    
                    n/=10;
                    digit++;

                }
                if(digit%2==0){
                    count++;
                }
            }
           return count;
    }
    //using another function

    static int checkeven3( int[] arr){
            int count=0;
            for(int num:arr){
                if(even(num)){
                    count++;
                }
            }
            return count;
    }
    static boolean even(int num){    
        int count=digit(num);
        return count %2 == 0;

    }
    
    static int digit(int num){
        if(num<0)
        {num=num*-1;}
        if(num==0){
            return 1;
            
        }
        int count=0;
        while(num>0){
                num/=10;
                count++;
        }
        return count;
    }
    
}