package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		int pr = sc.nextInt();
		System.out.print("받은돈: ");
		int won = sc.nextInt();
		
		System.out.println("받은돈: "+(float)won);
		System.out.println("상품가격: "+(float)won);
		System.out.println("부가세: "+(float)(pr*0.1));
		System.out.println("잔액: "+(float)(won-pr));
		
		sc.close();
	}

}
