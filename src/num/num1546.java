package num;

import java.util.Scanner;

public class num1546{
 
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       int n = in.nextInt();
       int total = 0;
       int max = 0;
       int score;
         for(int i=0; i<n; i++) {
    		   score = in.nextInt();
    		   total += score;
    		   if(score>max) {
    			   max = score;
    		   }
      }
         in.close();
         
         double avg = 0;
         avg = 100.0 *total /max/n;
         System.out.printf("%.2f", avg);
    }
}



