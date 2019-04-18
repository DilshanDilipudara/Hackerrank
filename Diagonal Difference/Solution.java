import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
         
          int firstsum = 0; 
          int secondsum = 0;

          for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length;j++){
                  if(i==j){
                     firstsum += arr[i][j];
                      //System.out.print(firstsum+" ");
                  }
                   
              }
          }
           
           for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length;j++){
                  if(i==arr.length-j-1){
                     secondsum += arr[i][j];
                      System.out.print(secondsum+" ");
                  }
                   
              }
           }

            return Math.abs(firstsum-secondsum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
