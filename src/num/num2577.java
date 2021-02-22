package num;

import java.util.Scanner;

public class num2577{
 
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        in.close();
        
        int[] counts = new int[10];
        int number = A * B * C;
        while (number>0) {
        	counts[number%10]++;
        	number /= 10;
        }
        for (int i = 0; i< counts.length; i++) {
        	System.out.println(counts[i]);
        }
      }
    }



