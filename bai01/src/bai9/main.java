package bai9;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		float a,b,x;
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		if(b==0) {
			x=0;
			System.out.println("nghiem cua phuong trinh la: "+x);
		}
		else if(a==0 && b==0) {
			System.out.println("pt vo so nghiem");
		}
		else if(a==0 && b!=0) {
			System.out.println("pt vo nghiem");
		}
		else {
			x=a/b;
			System.out.println("nghiem cua pt la: "+x);
		}
	}

}
