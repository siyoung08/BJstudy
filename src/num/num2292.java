package num;

import java.util.Scanner;

public class num2292 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
     int N =in.nextInt();
     int count =1;
     int range =2;
	
	

     if (N==1) {
	     System.out.print(1);
       }

     else {
	    while(range <=N) {
		range =range + (6*count);
		count++;
		}

     System.out.print(count);
         }
    }
}


		
	  
	

