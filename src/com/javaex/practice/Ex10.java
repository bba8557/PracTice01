package com.javaex.practice;

public class Ex10 {
	public static void main(String[] args) {
		
		/*문제
		  int x;
		  System.out.println(x);
		 */
		
		/*해결*/
		//선언 X을 하였지만 초기화를 하지 않았다
		int x;
		//x를 초기화 하면 오류해결됨
		x = 1;
		//출력할 내용이 없어 오류가남
		System.out.println(x);
	}

}
