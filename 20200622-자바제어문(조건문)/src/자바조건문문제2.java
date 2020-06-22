
/* 사용자 입력 => 0, 1, 2
 0이면 가위, 1이면 바위 2면 1보
 
*/


import java.util.*;
public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Scanner scan=new Scanner(System.in);
	System.out.println("가위(0),바위(1),보(2)입력:");

	int user=scan.nextInt();
			
	if(user==0)
	{
	System.out.println("Player:가위");
	}
	if(user==1)
	{
		System.out.println("Player:바위");
	}
		if(user==2)
		System.out.println("Player:보");
	}*/

		
	// 컴퓨터
		/*
		 * int com=(int)(Math.random()*3); // Math.random : 0.0~0.99 따라서
		 * Math.random*3==0.0~2.9...==(int) => 0~2 if(com==0) {
		 * System.out.println("컴퓨터:가위"); } if(com==1) { System.out.println("컴퓨터:바위"); }
		 * if(com==2) { System.out.println("컴퓨터:보"); }
		 */
		
	
		//결과를 비교
		/* 컴퓨터: 가위
		 	- 사용자: 가위 바위 보
			*/		
	
		//중첩조건문
		
	/*if(com==0)
	{
		if(user==0)
	 {
		 System.out.println("비겼습니다");
	 }
	 if(user==1)
	 {
		 System.out.println("사용자 승");
	}
	 if(user==2)
			 {
		 System.out.println("컴퓨터 승");
			 }
	}
	if(com==1)
	{
		 if(user==0)
		 {
			 System.out.println("컴퓨터 승");
		 }
		 if(user==1)
		 {
			 System.out.println("비겼습니다");
		}
		 if(user==2)
				 {
			 System.out.println("사용자 승");
				 }
		
	}
	if(com==2)
	{
		 if(user==0)
		 {
			 System.out.println("사용자 승");
		 }
		 if(user==1)
		 {
			 System.out.println("컴퓨터 승");
		}
		 if(user==2)
				 {
			 System.out.println("비겼습니다");
				 }
	
	}
	
	}
}

정수, 실수, 문자일 경우, == 사용 가능
"" 문자열: ==으로 비교가 불가능 => equals()로 비교


	*/ 
	
		
		
}
