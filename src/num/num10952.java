package num;

import java.util.Scanner;

public class num10952 {
 
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        
        while(true){
        	
        
        int A = in.nextInt();
        int B = in.nextInt();
        
         
       if(A==0 && B==0) {
    	   in.close();
    	   break;
       }
        System.out.println(A+B);
    }
}
}

