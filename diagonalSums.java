import java.util.*;
public class diagonalSums{
    public static int diagonalSum(int matrices[][]){
        int sum=0;
          for(int i=0;i<matrices.length;i++){
            // pd
            sum += matrices[i][i];
            // sd
            sum += matrices[i][matrices.length-i-1];
          }

        return sum;
    }
    
    public static void main(String args[]){
        int matrices[][]={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
        };
        System.out.print(diagonalSum(matrices));
    }
}
