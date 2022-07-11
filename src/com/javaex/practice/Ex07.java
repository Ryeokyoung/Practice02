package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[]agrs) {
		System.out.println("숫자입력");
		System.out.println("숫자1:");
		System.out.println("숫자2:");
		Scanner sc = new Scanner(System.in);
	
		int ip1 = sc.nextInt();
		int ip2 = sc.nextInt();
		
		if(ip1>ip2) {
			System.out.println("몫:"+ip1/ip2);
			System.out.println("나머지:"+ip1%ip2);
		}else {
			System.out.println("몫:"+ip2/ip1);
			System.out.println("나머지:"+ip2%ip1);
		}
		sc.close();
		
		
	}
}
