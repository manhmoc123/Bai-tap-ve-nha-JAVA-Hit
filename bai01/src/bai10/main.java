package bai10;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		 float a,b,c,x1,x2,denta;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("nhap he so a,b,c vao tu ban phim");
		 System.out.print("a= ");a=sc.nextFloat();
		 System.out.println();
		 System.out.print("b= "); b=sc.nextFloat();
		 System.out.println();
		 System.out.print("c="); c=sc.nextFloat();
		 denta=b*b-4*a*c;
		 if(denta<0) {
			 System.out.println("pt vo nghiem");
			 
		 }
		 else if(denta==0) {
			 x1=-b/2*a;
			 System.out.println("pt co nghiem kep x1=x2= "+ x1);
		 }
		 else {
			 System.out.println("pt cos 2 nghiem phan biet: ");
			 x1=(float)(-b+Math.sqrt(denta))/2*a;
			 x2=(float)(-b-Math.sqrt(denta))/2*a;
			 System.out.println("x1= "+x1);
			 System.out.println("x2= "+x2);
			 
		 }
	}

	}
