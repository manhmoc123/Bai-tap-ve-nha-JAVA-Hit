package bai7;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		float a,b,max;
		Scanner sc=new Scanner(System.in);
		System.out.print("a="); a=sc.nextInt();
		System.out.println();
		System.out.print("b="); b=sc.nextInt();
		if(a>b) {
			max=a;
		}
		else {
			max=b;
		}
		System.out.println("max"+a+","+b+"la: "+max);
		
	}

}
