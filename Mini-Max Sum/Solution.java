import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
           long max = -2147483648;
           long min = 2147483647 ;
            long minSum = 0;
           long  maxSum = 0;
           boolean flag = false;

           for(int i=0;i<arr.length-1;i++){
               if(arr[i]!=arr[i+1]){
                   flag = true;
                   break;
               }
           }
           

           for(int i=0;i<arr.length;i++){
               if(arr[i]>max){
                   max = arr[i];  
               } 
                if(arr[i]<min){
                   min = arr[i];
               }
           }
           
           for(int k= 0;k<arr.length;k++){
               if(arr[k]!=min){
                   maxSum += arr[k];
               }
               if(arr[k]!=max){
                   minSum += arr[k];
               }
           }

           if(flag == false){
               System.out.println(arr[0]*4 +" "+arr[0]*4);
           }
           else{
                   System.out.println(minSum+" "+maxSum);
           }

           
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
           long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
