import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertIntoSorted(int[] arr) {
        int pointer = arr[arr.length-1];
        for(int i = arr.length-2; i  >=0; i--){
            if(pointer >= arr[i]){
                arr[i+1] = pointer;
                printArray(arr);
                break;
            }
            arr[i+1] = arr[i];
            printArray(arr);
        }
        if(pointer < arr[0]){
          arr[0] = pointer;  
          printArray(arr);
        } 
        
    }
 
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); 
         }
         insertIntoSorted(arr);
    }
    
    private static void printArray(int[] arr) {
      for(int val: arr){
        System.out.print(val+" ");
      }
      System.out.println("");
    }
    
}
