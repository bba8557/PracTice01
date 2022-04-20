package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int r = sc.nextInt();
		System.out.print("구의부피는:"+(4*3.14*r*r*r)/3+" 입니다.");
		
		sc.close();
	}

}
