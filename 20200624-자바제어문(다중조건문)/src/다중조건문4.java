/*
	사용자=> 정수입력(1~12)
	12, 1, 2 => 겨울입니다
	3, 4, 5 => 봄입니다
	6,7,8 => 여름입니다.
	9, 10, 11 => 가을입니다.
*/

import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력(1~12):");
	
		int month=scan.nextInt();
		if(month==12 || month==1 || month==2) {
			System.out.printf("겨울입니다");
		}
		else if (month==3 || month==4 || month==5) {
			System.out.printf("봄입니다");
		}
		else if (month==6 || month==7 || month==8) {
			System.out.printf("여름입니다");
		}
		else if (month==9 || month==10 || month==11) {
			System.out.printf("가을입니다");
		}
		else
		{
		}

		/*문자를 입력받아서 char ch
			=숫자 ch>='0' && ch<='9'
			=알파벳 ch>='A' && ch<='Z' || ch>='a' && ch<='z'
			=한글 ch>='가' && ch<='힣'
			=특수 문자
		*/
		char ch=0;
		System.out.println("문자를 입력하세요:");
		ch=scan.next().charAt(0);
			
			
		if(ch>='0' && ch<='9') {
			System.out.println(ch+"숫자입니다");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println(ch+"알파벳 대문자입니다");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println(ch+"알파벳 소문자입니다");
		}
		else if(ch>='가' && ch<='힣') {
			System.out.println(ch+"한글입니다");
		}
		else {
			System.out.println("특수문자입니다");
		}
		
		
	}

}
