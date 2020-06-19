
/*
	대입 연산자: 결과값을 받는다
		1. 종류
			= => int a=10 (10을 a라는 메모리에 대입한다)
			 1) 복합대입연산자
				op= : op(연산자)	
					+= => int a=10; a+=2; => a=a+2 => a=12
					-= => int a=10; a-=5 => a=a-5 => a=5
					*= => int a=10; a*=5; => a=a*5 => a=50
				 	/= => int a=10; a/=3; => a=a/3 => a=3
				  	%= => int a=10; a%=3; => a=a%3 => a=1
				  	|= => int a=10; a|=3; => 1010 | 0011 => 1011 => a=11
				  	&= => int a=10; a&=3; => 1010 * 0011 => 0010 => a=2
				  	<<= => int a=10; a<<=3; => 1010000 => 10*2^3 => a=80
				  	>>= => int a=10; a>>=3; => 
				  	
				  	10/2^3 => a=1
				  	
						*한개가 증가할 시: 증가 연산자 => a++, ++a, a+=1, a=a+1
						*원하는 갯수만큼 증가 : 복합 대입연산자
				
			
		
*/


public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a+=5;
		System.out.println("a="+a);  //=> a값에 5를 더한다
		
		int b=10;
		b-=5;
		System.out.println("b="+b);  //=> b값에 5를 빼라
		
		int c=10;
		c=c*5;
		System.out.println("c="+c);
		
		int d=10;
		d/=3;
		System.out.println("d="+d);
		
	}

}
