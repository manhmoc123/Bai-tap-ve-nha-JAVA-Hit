package bai02;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String a;
		int tong=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao chuoi a");
		a=sc.nextLine();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='1') {
				tong+=1;
			}	 
			else if(a.charAt(i)=='2') {
				tong+=2;
			}
			else if(a.charAt(i)=='3') {
				tong+=3;
			}else if(a.charAt(i)=='4') {
				tong+=4;
			}
			else if(a.charAt(i)=='5') {
				tong+=5;
			}
			else if(a.charAt(i)=='6') {
				tong+=6;
			}
			else if(a.charAt(i)=='7') {
				tong+=7;
			}
			else if(a.charAt(i)=='8') {
				tong+=8;
			}
			else if(a.charAt(i)=='9') {
				tong+=9;
			}			
		}
		System.out.println(tong);
	}

}
