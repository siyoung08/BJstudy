package num;

import java.util.Scanner;
public class num2839 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N =in.nextInt();
		int count =0;
		
		while(true) {
			if (N%5 ==0) {
				System.out.println(N/5 + count);
				break;
			}
			else if(N<0) {
				System.out.println(-1);
				break;
			}
			N = N-3;
			count++;
			in.close();
		}
	
	}
}



		
	  
	

