package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1:");
		System.out.println("숫자2:");
		
		int ip1= sc.nextInt();
		int ip2= sc.nextInt();
		if(ip1>ip2) {
			System.out.print("큰수:"+ip1);
			System.out.print("\t작은수:"+ip2);
			
		}else {
			System.out.print("큰수:"+ip2);
			System.out.print("\t작은수:"+ip1);
		}
		sc.close();
	}
}
