
/*
	선택조건문
	 if(조건문)
	 	{
	 		조건문이 true면 수행하는 문장 구현
	 	}
	 else
	 {
	 	조건문이  false일때 수행하는 문장 구현
	 	}

	조건문 => 핵심 (조건 제작)
		==, <, >, != -> 단일
		&&, || -> 조건이 여러개일 때
		
		ch>='A' && ch<='Z'
		ch>='0' && ch<='9'
		ch>='가' && ch<='힣'  => 번호가 일률적으로 배열되어야한다
			ex) 1,2,5,7,9
				ch==1 || ch==2 || ch==5 || ch==7 || ch==9
	문자열 ==> !=, ==을 사용하지 않고, equals()를 사용
			equals() =>  같다
			!equals() => 같지 않다.

*/
import java.util.*;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자 한개를 입력 받아서 알파벳인지 여부
		char ch='A';
		Scanner scan=new Scanner(System.in);
		System.out.print("문자입력:");
		ch=scan.next().charAt(0); //자바는 모든 시작번호 0부터 시작한다 ex)"ABC"이면 "A"를 출력
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
			System.out.println(ch+"는(은) 알파벳입니다!");
		}
		else {
			System.out.println(ch+"는(은) 알파벳이 아닙니다!");
		}
		
		int a;
	    a=scan.nextInt();
		
		System.out.print("입력칸");
		if(a>=0 && a<=9) {
			System.out.println(a+"는(은) 숫자입니다");
		}
		else {
			System.out.println(ch+"는(은) 숫자가 아닙니다!");
		}
		
		
		
	}

}
