import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0;i<testCases;i++){
            String s = sc.next();
            for(int j=0;j<s.length();j=j+2){
                System.out.print(s.charAt(j)); 
            }
            System.out.print(" ");
            for(int j=1;j<s.length();j=j+2){
                System.out.print(s.charAt(j)); 
            }
            System.out.println();

        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

