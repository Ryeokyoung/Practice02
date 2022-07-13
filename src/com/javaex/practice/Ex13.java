package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[]agrs) {
		System.out.println("숫자를 입력해주세요");
		System.out.println("숫자:");
		Scanner sc = new Scanner(System.in);
	
	
		double num = sc.nextDouble();
		
		
		if(num>0) {
			double answer1 = (7*num)+2;
			System.out.println("계산결과는"+answer1+"입니다.");
		}else{
			double answer2 = (num*num*num)-(9*num)+2;
			System.out.println("계산결과는"+answer2+"입니다.");
		}
		
	
		sc.close();
	}	
	
	
}
