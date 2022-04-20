package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		//i++ 나중 -> 10%2 -> 1
		
		System.out.println(i);//i++ 나중 10+1 11
		System.out.println(n);//나머지 0
		
	}

}
