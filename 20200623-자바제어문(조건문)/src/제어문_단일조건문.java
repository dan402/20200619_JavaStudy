
/*자바에서 지원하는 제어문
 	1.조건문, 선택문
 		=단일 조건문: if***
 		=선택 조건문: if~else***
 			형식) if(조건)
 				{
 					조건이  true일 경우에 처리문장
 					}
 		=다중 조건문: if~else if~else if~else if~else***
 			형식) if(조건문)
 					{
 						조건이  true일 경우에 처리문장  => 만약 수행되면 종료
 					}
 				else if(조건문)
 					{
 						조건이  true일 경우에 처리문장
 					}
 				else if(조건문)
 					{
 						조건이  true일 경우에 처리문장
 					}
 				else
 					{ 
 						해당 조건이 없는 경우에 무조건 수행하는 문장
 					}
 		=선택문: switch~case
 	2. 반복문
 		=반복 횟수가 지정된 경우 (for)***
 		=반복 횟수가 지정이 안된 경우 (while)***
 		=반드시 한번 이상 수행 (do~while)
 	3. 반복 제어문	
 		= break : 반복을 종료***
 		= continue : 특정 부분을 제외
 
*/

import java.util.*;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		char op='+';

		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		a=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		b=scan.nextInt();
		System.out.print("연산자(+,-,*,/):");
		op=scan.next().charAt(0); 
		//Scanner는 char를 받아서 처리하는 기능이 없다 =>따라서 문자열로 받아야함
		//System.in => 예외처리를 반드시 해야 한다.
		
		if(op=='+');
		{
			System.out.printf("%d-%d=%d\n",a,b,a+b);
		}
		if(op=='-');
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*');
		{
			System.out.printf("%d-%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			if(b==0)
			{
			System.out.printf("0으로 나눌수 없습니다");
			}
			else
			{
				System.out.printf("%d-%d=%.2f\n",a,b,a/(double)b);
			}
		}
		
		/*
		 * main => end =====> 프로그램 종료
		 * main: 프로그램 시작
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	
	
	
	
	
	}

}
