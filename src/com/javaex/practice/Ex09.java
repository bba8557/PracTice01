package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		/*화씨는 시작온도가 32도에서 시작하기에 빼기 32를 해줘야된다(9/5는1.8가 같다)
		  그리고나서 마지막에 나누기1.8을해주면 섭씨온도를 알수있다
		  
		  분자/분모 공식에선 반대로 분모/분자로 되있다 즉 5/9가 아닌 9/5가 맞다*/
		double f = 80.0;
		System.out.println((f-32.0)/1.8);
	}

}
