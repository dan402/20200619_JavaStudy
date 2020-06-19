
/*
1. 연산자
	1)연산자의 종류
		-단항연산자
		  	가. *증감연산자 (++,--)
		  	나. *부정연산자 (!)
		  	다. 부호연산자 (+, -) :   양수, 음수
		  	라. *형변환연산자 ((type)): type-> int, byte, char, double => 데이터형을 변경해서 연산처리가 가능하게 만든다 (연산: 데이터형이 동일해야함)
		-이항연산자
			가. 산술연산자 (+, -, *, /, %) => 형변환
				/(나누기) : 0으로 나눌수 없다, 정수/정수=정수 
				%(나머지)
				ex) 5/2=1 =>5%-2(1), -5%2(-1), -5%-2(-1) *음수끼리 나눠도 값은 왼쪽 값의 수를 따른다.
			나. 비트연산자 (&, ㅣ, ^)
			다. 쉬프트연산자(<<, >>)
			라. 비교연산자(==, !=, <, >, <=, >=)
			마. 논리연산자 (&&,ㅣㅣ)
			바. 대입연산자 (=, +=, -=, ...)
		-삼항연사자
			조건? 값1:값2
			조건: ture =>  값1
			조건: false => 값2
			
	2)연산방법
		- 단항연산자
		 	가. 증감연산자 - ++ : 무조건 한개를 증가한다, --: 무조건 한개를 감소한다 	
		 			++a(--a) :  전치연산자, a++(a--) : 후치연산자  => 반복문, 게임로직 짤때 사용
		 			*전치연산자: 증가한 다음에 대입								
		 			int a=10; int b=++a => ++ (1번 계산 - +1 증가)	=(2번 계산) ==> Ans: a=11, b=11
		 			*후치연산자: 대입을 먼저하고 나중에 증가
		 			int a=10; int b=a++ => b=a (1번 계산)	++(2번 계산) 		==> Ans: b=10, a=11
		 	나. 부정연산자 : true => false로 변환하거나 false => true로 변환할때 '!'사용 
		 					*반드시 bloolean을 사용한다.
		 				ex) boolean bCheck=false;								boolean bCheck=false;
		 					!bCheck => sysout Ans: false						bCheck=!bCheck; => sysout Ans: True
		 				*bloolean은 자동으로 연산처리를 하지 않는다.
		 					
	3)연산자 우선순위
	

*/


public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=++a;
		System.out.println("a="+a+",b="+b); // 전치 연산  -> a=11, b=11
	
		/*
		 * int a1=10; int b1=a++; System.out.println("a="+a+",b="+b); // 후치 연산 -> a=12,
		 * b=11
		 */		
		
		a=10;
		b=++a + ++a + ++a + ++a;
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a++ + a++ + a++ + a++;
		System.out.println("a="+a+",b="+b);
		
	}

}
