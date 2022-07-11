package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[]agrs) {
		System.out.println("숫자입력");
		System.out.println("숫자1:");
		System.out.println("숫자2:");
		Scanner sc = new Scanner(System.in);
	
		int ip1 = sc.nextInt();
		int ip2 = sc.nextInt();
		
			
			
		if((ip1>ip2) && (ip1%ip2==0)) {
			System.out.println(ip2+"는"+ip1+"의 약수");
		}else if((ip1>ip2) && (ip1%ip2!=0)) {
			System.out.println(ip2+"는"+ip1+"의 약수가 아닙니다");
		}else if((ip2>ip1) && (ip2%ip1==0)){
			System.out.println(ip1+"는"+ip2+"의 약수");
		}else {
			System.out.println(ip1+"는"+ip2+"의 약수가 아닙니다");
		}
		
		sc.close();
			
		
		
		
	
	}
}
