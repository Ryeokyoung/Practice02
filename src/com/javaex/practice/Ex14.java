package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[]agrs) {
		System.out.println("수익을 입력해주세요");
		System.out.println("금액:");
		
		Scanner sc = new Scanner(System.in);
		
		double tax = sc.nextDouble();

		
		if((0<=tax && tax<=1000)) {
			double c1 = (double) (0.09*tax);
			System.out.println("소득세는"+c1+"입니다");
			
		}else if(1000<tax && tax<=4000) {
			double c2 = (double) 1000*0.09+(0.18*(tax-1000));
			System.out.println("소득세는"+c2+"입니다");
 
		}else if(4000<tax && tax<=8000) {
			double c3 = (double) 1000*0.09+3000*0.18+0.27*(tax-4000);
			System.out.println("소득세는"+c3+"입니다");
			
		}else if(tax>8000) {
			double c4 = (double) 1000*0.09+3000*0.18+4000*0.27+0.36*(tax-8000);
			System.out.println("소득세는"+c4+"입니다");
		}
		sc.close();		
		
		}
			
	
	
	
	
	
	
	}

