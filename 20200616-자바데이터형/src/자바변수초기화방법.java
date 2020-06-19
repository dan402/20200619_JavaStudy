
/* 변수초기화
  1. 직접처리 : int a=100;
  2. 선언 -> 키보드에서 받아서 저장 
  3. 임의의 수를 저장 (랜덤) => 게임, 로또 등 랜덤 추첨방식
  4. 입력 창을 만들어서 값을 받는 방식 

 * 초기화방식
  1. 선언 동시에 초기값 부여 => 관리자용으로 많이 사용
     int a=100;
  2. 선언하고 나중에 초기값을 부여  => 사용자용 개발에 많이 사용
  	 int a;
  	 a=200;
  	
  	 
*/

import java.util.*;
// String, System, Math => java.lang => 생략이 가능 


public class 자바변수초기화방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println("a="+a);
		
		int b;
		b=200;
		System.out.println("b="+b);
		
		int c;
		c=(int)(Math.random()*100)+1;  //가공 -> 연산처리
		// Math.random => 0.0 ~ 0.99 *100 => int로 변환하면 0~99 =>+1하면 1~100 사이의 숫자 표현
		System.out.println("c="+c);
		
	/*	
		int d;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력:"); */
	
	}
	
}