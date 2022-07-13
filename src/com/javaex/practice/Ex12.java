package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[]agrs) {
		System.out.println("출력입력");
		System.out.println("기호:");
		System.out.println("숫자1:");
		System.out.println("숫자2:");
		Scanner sc = new Scanner(System.in);
		
		String sign = sc.nextLine();
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
	
		
		switch(sign) {
		case "+":
			System.out.println("결과는:"+(num1+num2));
			break;
		
		case "-":
			System.out.println("결과는:"+(num1-num2));
			break;
				
		case "*":
			System.out.println("결과는:"+(num1*num2));
			break;
		case "/":
			System.out.println("결과는:"+(num1/num2));
			break;
		default:
			System.out.println("잘못된 값입니다");
			break;
			
			
		}
		sc.close();
	}
	
}
