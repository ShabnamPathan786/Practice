import java.util.*;
public class array2d{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
            int[][] arr2D = new int[3][2];
            for (int row = 0; row < arr2D.length; row++) {
                for (int col = 0; col < 2; col++) {
                    arr2D[row][col] = sc.nextInt();

                }

            }
            for (int row = 0; row < arr2D.length; row++) {
                for (int col = 0; col < 2; col++) {
                    System.out.print(arr2D[row][col] + " ");

                }
                System.out.println();
            }

            int[][] ar2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
            };

            //  for (int row = 0; row < ar2D.length; row++) {
            //     for (int col = 0; col < ar2D[row].length; col++) {
            //         System.out.print(ar2D[row][col] + " ");
            //     }
            //     System.out.println();
            // }
            //OR 
            for (int row = 0; row < ar2D.length; row++) {
                System.out.println(Arrays.toString(ar2D[row]));
            }


    }

}