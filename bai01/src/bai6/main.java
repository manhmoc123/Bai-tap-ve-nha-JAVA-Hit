package bai6;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int n1,m1,tong1;
		float n2,m2,tong2,tong3;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("n1="); n1=sc.nextInt();
		System.out.println();
		System.out.print("m1="); m1=sc.nextInt();
		System.out.println();
		System.out.print("n2="); n2=sc.nextFloat();
		System.out.println();
		System.out.print("m2="); m2=sc.nextFloat();
		System.out.println();
		tong1=n1 + m1;
		tong2=n2 + m2;
		tong3=n1 + n2;
		System.out.println("n1 + m1 = "+tong1);
		System.out.println("n2 + m2 = "+tong2);
		System.out.println("n1 + n2 = "+tong3);
	}

}
