package bai3;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		 System.out.println("1.Tạo và nhập mảng mới với n số nguyên\r\n" + 
		 		"2.Hiển thị mảng vừa tạo\r\n" + 
		 		"3.Thêm một phần tử vào vị trí thứ k\r\n" + 
		 		"4.Xóa một phần tử ở vị trí thứ k\r\n" + 
		 		"5.Đảo ngược mảng:\r\n" + 
		 		"VD: {3,1,2,4,5} -> {5,4,2,1,3}\r\n" + 
		 		"6.Hiển thị số a[1] và các số chia hết cho a[1]\r\n" + 
		 		"7.Thoát.");
		 int n,x;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println(" nhap vao so phan tu cua mang");
		 n=sc.nextInt();
		 int []a= new int[n];
		 for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			 }
		 System.out.println(" Moi chon:");
		 x=sc.nextInt();
		 switch (x) {
		case 1:{
			
			break ;
			}
		case 2:{
			for(int i=0;i<a.length;i++) {
				System.out.println("a["+i+"]= "+a[i]);
			}
			break;
		}
		case 3:{
			System.out.println(" nhap vi tri muon them pha tu");
			int k=sc.nextInt();
			System.out.println("nhap gia tri muon chen:");
			int s=sc.nextInt();
			n+=1;
			for(int i=a.length;i>=k;i--) {
				a[i]=a[i-1];
			}
			a[k]=s;
			break;
		}
		case 4:{
			System.out.println("nhap vi tri muon xoa ptu:");
			int k=sc.nextInt();
			for(int i=k; i<a.length;i++) {
				a[i]=a[i+1];
				
			}
			n--;
			break;
		}
		case 5:{
			for(int i=0;i<a.length/2;i++) {
				swap(a[i],a[n-1-i]);
			}
			break;
		}
		case 6:{
			System.out.println(a[1]);
			System.out.println(" cac so chia het cho "+a[1]+"la: ");
			for(int i=0; i<n;i++) {
				if(a[i]%a[1]==0) {
					System.out.println(a[i]);
				}
			}
			break;
		}
		case 7:{
			break;
		}
		
	}

}

	public static void swap(int a, int b) {
		int tam=a;
		a=b;
		b=tam;
		
	}}