package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[]agrs) {
		System.out.println("알파벳 1글자입력");
		System.out.println("알파벳:");
	
		Scanner sc = new Scanner(System.in);
	
		String alpha = sc.nextLine();
		
		switch(alpha) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("모음");
			break;
			
		default:
			System.out.println("자음");
			break;
	}
		sc.close();
	}
}
