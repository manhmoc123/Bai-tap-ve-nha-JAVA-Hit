package bai8;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		float a,b,c,max;
		Scanner sc=new Scanner(System.in);
		System.out.print("a="); a=sc.nextInt();
		System.out.println();
		System.out.print("b="); b=sc.nextInt();
		System.out.println();
		System.out.print("c="); c=sc.nextFloat();
		max=a;
		if(max<b) {
			max=b;
		}
		else if(max<c) {
			 max=c;
		}
		System.out.println("max "+a+", "+b+", "+c+" la: "+max);
	}

}
