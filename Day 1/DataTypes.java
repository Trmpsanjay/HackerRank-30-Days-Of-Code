import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int num1=scan.nextInt();
        double num2 = scan.nextDouble();
        scan.nextLine();
        String name = scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        int ans = i+num1;
        System.out.println(ans);

        /* Print the sum of the double variables on a new line. */
        double ansDouble = d+num2;
        System.out.println(ansDouble);

		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        //String myaans = s+name;
        System.out.print(s+""+name);


        scan.close();
    }
}
