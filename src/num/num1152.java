package num;

import java.util.Scanner;
import java.util.StringTokenizer;

public class num1152 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String A =in.nextLine();
		in.close();
		
		StringTokenizer st =new StringTokenizer(A," ");
			System.out.println(st.countTokens());
		
	}
}
