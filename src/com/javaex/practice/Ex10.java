package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[]agrs) {
		System.out.println("사번입력");
		System.out.println("사번:");
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		
		if(code%3==0) {
			System.out.println("A팀");
		}else if(code%3==1){
			System.out.println("B팀");
		}else if(code%3==2) {
			System.out.println("C팀");
			
		}
	sc.close();
	
	}
}
