
import java.util.ArrayList;

public class lucky {
    public static void main(String[] args){
         int[][] matrix={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
         ArrayList<Integer> result = luckyNumbers(matrix);
         System.out.println(result);


    }

    static ArrayList<Integer> luckyNumbers(int[][] matrix){
     
          ArrayList<Integer> results = new ArrayList<>();
        for (int i=0; i<matrix.length;i++){
           for (int j=0; j<matrix.length-1; j++) {
                int min = matrix[i][0];
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                System.out.println(min);
                results.add(min);
            }
            
        }
        return results;

    }
}
