package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int won4 = sc.nextInt();
		System.out.print("100원 개수: ");
		int won3 = sc.nextInt();
		System.out.print("50원 개수: ");
		int won2 = sc.nextInt();
		System.out.print("10원 개수: ");
		int won1 = sc.nextInt();
		
		System.out.println("동전의 총합은 "+((500*won4)+(100*won3)+(50*won2)+(10*won1))+" 원 입니다.");
		
		sc.close();
				
	}

}
