
/*
	이항연산자
		1)산술 연산자 => 결과값을 알 수 없다 (고정값이 아니기 때문에)
		2)비교 연산자 => true / false
		3)논리 연산자 => true / false
			=> 비교 연산자와 논리 연산자가 많이 쓰이는 곳 : 조건문(if)
		4)대입 연산자
	
	
	비교연산자 : 수와 수를 비교 => 정수, 실수, 문자, 논리
			 	*문자열은 비교할 수 없다.  =>문자열을 저장하는 데이터형: String
			 		ex) "Hello"=="Hello" ====> equals()
			 		
	1. 종류
		== : 같다  		ex) 10==20 (false)
		!= : 같지 않다		ex) 10!=20 (true)
		< : 작다			ex) 10<10  (false)
		> : 크다			ex) 10>10  (false)
		<= : 작거나 같다	ex) 10<=10 (true)
		>= : 크거나 같다	ex) 10>=10 (true)
	2. 결과값 : boolean



*/
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=9;
		char c='A';
		System.out.println(++c);
		System.out.println(c);
		System.out.println(++b==a);
		System.out.println(b++==a);
		
		
		System.out.println('A'==65); //*char는 연산수행하면 정수로 변환된다.
	
	}

}
