
/*
	시프트연산자  << , >>
	: 비트 이동 연산자
		<< : 비트 왼쪽으로 이동할때 공백에 0으로 채움 
				=> 산술식: x<<y -> x*2^y(x*2의 y제곱)
			ex) 10<<2
				1010 => 10
			  	<<10 => 101000 = 40
		
		>> : 비트 오른쪽으로 이동할때, 공백을 제거
				=> 산술식: x>>y -> x/2^y (x/2의 y제곱)
			ex) 10>>2
				1010 => 10
				>>1010 => 10 = 2
				
				
				
				
				
				
				
		
		ex1) 8<<3							8>>3
			1000 => 1000000 = 64			1000 = > 1 = 1
			
			



*/
public class 이항연산자_시프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=2;
		System.out.println(x/2^y);
		
		System.out.println(10>>2);
	}

}
