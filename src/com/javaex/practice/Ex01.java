package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이");
		
		
		int age = sc.nextInt();
		
		
		//age가 0살 초과이고 18살 미만일 때 
		//두개이상의 조건일 때 어떻게 입력하는가? 
		if(0<age) {
			System.out.println("청소년입니다");
		}else if(age<18) {
			System.out.println("청소년입니다");
		}else {
			System.out.println("청소년이 아닙니다");
		}
		sc.close();
	}
}

