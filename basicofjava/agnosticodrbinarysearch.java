public class agnosticodrbinarysearch{
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.next();
            int mid=start+(end-start)/2;
                if(arr[mid]==target)
                    return mid;
                
                else if(arr[mid]<target)
                start=mid+1;

                else
                end=mid-1;
        }
        return -1;
    }
        }
    