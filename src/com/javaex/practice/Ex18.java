package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		int f = sc.nextInt();
		System.out.println("화씨 "+(float)f+" 의 섭씨온도는 "+((f-32)/1.8));
		
		sc.close();
	}

}
