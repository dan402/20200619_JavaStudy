
/*선택 조건문: if ~ else
	1. 형식 ex) 로그인 처리, 아이디 중복체크, 글쓰기(전송/취소), 짝수/홀수, 결제(처리/취소), 대문자/소문자
	 if(조건문)
	 	{
	 		==> 조건이  true일때 처리하는 문장
	 		}
	  else
		{
	 		==> 조건이 false일때 처리하는 문장
	 		}


*/

import java.util.Scanner; // 키보드로부터 입력값을 받는다.

public class 자바선택조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner를 저장 => 키보드의 입력값이 있는 경우에 처리
		Scanner scan=new Scanner(System.in); 
		// 자바의 모든 클래스, 사용자 정의 클래스 => 저장할때, 반드시 new를 이용해서 저장 // System.in: 사용자 키보드 입력값을 받는다, System.out: 모니터에 출력
		System.out.print("정수를 입력(1~100):");
		int a=scan.nextInt(); // 입력값 받아서 a라는 메모리 공간에 저장
		if(a<1 || a>100) // 1~100 사이의 정수가 입력되지 않았다면
			//  => true/false를 반대로 뒤집으려면 if(!(a<1 || a>100));, if(a>1 && a<100)
		{
			System.out.println("잘못된 입력입니다\n프로그램을 종료합니다");
		}
		
		else 
		{
			System.out.println(a+"가 입력되었습니다~");
		}
	}

}
