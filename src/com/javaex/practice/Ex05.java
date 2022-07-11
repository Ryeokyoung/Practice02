package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[]agrs) {
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.println("키:");
		System.out.println("몸무게:");
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int bw = (int) ((h-100)*0.9);
		if (w-bw>10) {
			System.out.println("과체중입니다");
		}else if(w-bw<-10){
			System.out.println("저체중입니다");
		}else {
			System.out.println("표준체중입니다");
		}
		sc.close();
		}
	}

