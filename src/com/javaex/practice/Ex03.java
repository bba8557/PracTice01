package com.javaex.practice;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		//a -> ++x(2)먼저*2 -> 4
		int b = y++ *2;
		//b -> y++(1)나중*2 -> 2
		
		//"" -> 정수가 아님 고로 + 할수없다
		System.out.println("a="+a);//4
		System.out.println("b="+b);//2
		
		//++x 이미 값이 증가상태
		System.out.println("x=" + x);//2
		//y++은 결과에서 증가 
		System.out.println("y=" + y);//2
		
		
	}

}
