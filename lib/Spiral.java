import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = { {2,5,8},{4,0,-1} };
        int row = matrix.length;
        int column = matrix[0].length;
        int j = 0;
        List<Integer> result = new ArrayList<Integer>();

        while(j!=row){
            for (int i = j; i < column-j; i++) {
                System.out.print(matrix[j][i]);
                result.add(matrix[j][i]);
            }
            // System.out.print(" ");
            // right
            if(row>1){
                for (int i = (j+1); i < row - (1+j); i++) {
                    System.out.print(matrix[i][column-1]);
                    result.add(matrix[i][column-1]);
                }
            }
            System.out.print(" ");
            // // // bottom
            if(j!=(int)row/2){
                for (int i = column - (j+1); i >= j+0; i--) {
                    System.out.print(matrix[row-(j+1)][i]);
                    result.add(matrix[row-(j+1)][i]);
                }
            }
            System.out.print(" ");
            // // left
            if(column>1) {
                for (int i = row - (j+2); i > j+0; i--) {
                    System.out.print(matrix[i][j]);
                    result.add(matrix[i][j]);
                }
            }
            
            System.out.print(" ");
            j++;
            // break;
        }


    }

}
