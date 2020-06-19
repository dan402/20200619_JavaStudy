
/* 책 p.55
	자바에서 지원하는 데이터형 -> 기본형
	1. 논리형 => boolean -> 값: True / False : if(조건문)을 사용할때 주로 사용하는 데이터형, 턴(term:차례)
	2. 
 	 double d='a'  =>d=97.0 : 자동으로 숫자변환 (업캐스팅), 개발자가 스스로 변환 (다운캐스팅)
 	 
 	 byte b1=10;									byte a=10;
 	 byte b2=20;									byte b=30;
 	 byte b3=b1+b2 (x) -> error						byte c=(byte)(a*b) = 답: 44
 	 
 	 ============>upcasting(자동형변환)
 	 byte < Short(char) < int < long < float < double
		<================= downcasting(강제형변환)

*/

public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean b1=false; // true,false는 항상 소문자로 =>1byte, boolean은 단독 사용
		 System.out.println("b1="+b1);
		 b1=true;
		 System.out.println("b1="+b1);

			byte a=10;
			byte b=30;
			int c=a*b;
			System.out.println("c="+c);

			System.out.println('A');
			System.out.println((int)'ㅋ'); //12619 => 'ㅋ' 각 문자는 숫자 번호를 가지고 있다 (char는 정수형으로 인식한다)
			System.out.println((char)12619);
	
			
			
	}
		
	
	
	
}
