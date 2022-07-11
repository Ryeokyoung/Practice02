package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력 :");
		int age = sc.nextInt();
		if(age>=19 && age<65) {
			System.out.println("\"1번그룹\"");
			
		}else {
			System.out.println("\"2번그룹\"");
		}
		sc.close();
	}
}
