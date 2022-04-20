package com.javaex.practice;

public class Ex07 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		//++i 먼저 -> 11%2 -> 1
		System.out.println(i);//++i 먼저 증가하여 11
		System.out.println(n);//1
	}

}
