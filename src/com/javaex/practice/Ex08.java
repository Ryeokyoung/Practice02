package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] agrs) {
		System.out.println("숫자1:");
		System.out.println("숫자2:");
		System.out.println("숫자3:");
		Scanner sc = new Scanner(System.in);

		int ip1 = sc.nextInt();
		int ip2 = sc.nextInt();
		int ip3 = sc.nextInt();
		int m;
		
		if((ip1<=ip2) && (ip1<=ip3))m=ip1;
		else if((ip2<=ip1) && (ip2<=ip3))m=ip2;
		else m = ip3;
			
		System.out.println("가장 작은수:"+m);
		
		sc.close();
	}
}
