
/*
		 응용시, 많이 사용하는 연산자
		 	1) 증감연산자 (++,--)
		 	2) 산술연산자(+,-,*,/)
		 	3) 비교연산자, 논리연산자
		 	4) 대입연산자 (=, +=, -=)
		 	
		 	
		 기타연산자
		  - 삼항연산자 : 조건? 값1:값2  ==> if~else  => 게임에서 많이 사용
				true = 값1, false = 값2
			

*/

import java.util.*; //import java.lang.* => system, string, math 
public class 이항연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수를 입력받아서 짝수인지 홀수인지 판별
		  Scanner scan=new Scanner(System.in);  //system. in => 키보드 입력값, system.out => 화면
		  System.out.println("정수입력:");  
		  int a=scan.nextInt();  //입력받은 정수를 저장
		  System.out.println(a%2==0?"짝수입니다":"홀수입니다");
		  
		  int a1=(int)(Math.random()*100)+1;
		 /*// 	 =====------------------ >>	
		  			②		①			  ③
		  	연산자 우선순위
		  	 1) 괄호
		  	 2) 단항연산자
		  	 3) 이항연산자	
		 */ 
	
		  System.out.println("a1="+a1);
		  System.out.println(a%2==0?"짝수입니다":"홀수입니다");
		  
		  
		
	}

}
