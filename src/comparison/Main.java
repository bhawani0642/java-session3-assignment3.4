
package comparison;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;

		Scanner pri = new Scanner(System.in);
	
	 System.out.println("Enter a byte");
	  a=pri.nextByte();
	  System.out.println("Enter a  short");
	  b=pri.nextShort();
	  c=a+b;
	  System.out.println("sum of byte and short is = " + c);
	  d=b+c;
	  System.out.println("Sum of short and int is= " + d);
	  e=c+d;
	  System.out.println("Sum of int and long is= "+e);
	  f= d + e;
	  System.out.println("Sum of long and float is= " +f);
	  

	}
}
