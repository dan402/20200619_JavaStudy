
/*
	논리연산자
	1. 형식
		1) && (앤드) : 직렬연산자 => 두개가 true  =>  범위, 기간을 포함할때 사용
		2) || (오어) : 병렬연산자 => 한개 이상이 true => 범위나 기간을 벗어나는 경우에 주로 사용
			ex) jumsu>=90 (&&) jumsu <=100 
				jumsu<=0 (||) jumsu > 100
				조건 (&&, || ), 조건  => true / false 
			
								&&			  ||
			true true		   true			 true
			true false		   false		 true 
			false true		   false		 true
			false false		   false		 false
			==============================================
			
			ex) 6<5 && 10 == 10
				false && true => false
				
		효율적인 연산
		1) && 왼쪽에 있는 조건이  false면, 오른쪽 연산은 하지 않는다.
		2) || 왼쪽에 있는 조건이  true면, 오른쪽 연산은 하지 않는다.
		int a=10;
		int b=9;
		
		a<b && ++b==a  => a<b가 false 이면 뒷 식은 계산하지 않는다.

*/

public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1='A';
		int i=65;
		char c2='B';
		
		System.out.println(c1==i || ++c1==c2);
		
	}

}
