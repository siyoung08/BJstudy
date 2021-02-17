package num;

import java.util.Scanner;
public class num1{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		
		int a,b,c;
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		in.close();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c );
		System.out.println((a*b)%c);
		System.out.println(((a % c) * (b%c))%c);
	}
}

