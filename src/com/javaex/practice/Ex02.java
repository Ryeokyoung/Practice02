package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값 입력");
		int x = sc.nextInt();
		
		//x가 0과 같으면 
		if (x==0) {
			System.out.println("x는 0이다");
		}else {
			System.out.println("x는 0이 아니다");
		}
		sc.close();
	}
}
