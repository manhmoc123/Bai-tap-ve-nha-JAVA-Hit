package bai01;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println(" nhap vao so nguyen n ");
		n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]= ");
			a[i]=sc.nextInt();
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					int tam=a[i];
					a[i]=a[j];
					a[j]=tam;
				}
			}
		}
		System.out.println("phần tử lớn thứ 3 trong mang la: "+a[2]);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
