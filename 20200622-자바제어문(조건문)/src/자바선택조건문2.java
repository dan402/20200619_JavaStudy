
/*
	ex) 사용자가 년도를 입력하면 윤년여부 확인
		=> 조건 1. 4년마다 1번씩 => year%4==0
		=> 조건 2. 100년마다 제외 ==> year%4==0
		=> 조건 3. 400년마다 포함 ===> year%400==0
		
			공식: if((year%4==0 && year%4==0 || (year%400==0))
			
		- 범위, 기간이 포함 => &&
		- 범위, 기간이 포함이 안될 경우 ==> ||
		- 제외시키는 경우 ===> &&
		
*/

import java.util.*;
public class 자바선택조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("년도입력"); // 입력값을 받아서 year 저장
		year=scan.nextInt();
		
		//윤년 여부를 확인
			if((year%4==0 && year%4==0 || (year%400==0))) // 윤년이라면
			{
				System.out.println(year+"는(은) 윤년입니다");
			}
			else
			{
				System.out.println(year+"는(은) 윤년이 아닙니다");
			}
	}

}