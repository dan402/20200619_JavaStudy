
/*
char 변수 선언 => 값을 대입

=> char alpha='A'
	=> alpha가 대문자면 소문자 출력
	   alpha가 소문자면 대문자 출력

	1. 제어문
		연산자(비교 연산자, 논리연산자, 부정연산자)
			가. 비교연산자
			나. 논리연산자 
				- &&(포함)-> 기간이나 범위지정, 조건 && 조건 => 조건이 둘다  true일때만 연산처리
				- ||(미포함)
			다. 부정연산자: 반대(!)
		단독처리 => 산술연산자, 증감연산자, 대입연산자=======> 응용 => 제어문
		연산처리 => 형변환 (강제 형변환)
		 double => int----> (int)double
		 int => char -----> (char)int
		 
		 
*/


public class 자바조건문문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char alpha='K';
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println((char)(alpha+32));
		}
		if(alpha>='a' && alpha<='z')
		{
			System.out.println((char)(alpha-32));
		}
	
	}

}
