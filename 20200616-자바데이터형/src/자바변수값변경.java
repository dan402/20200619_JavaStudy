
/* 변수 선언->변수 초기화 -> 변수 값 변경 -> 다른 변수에 값 전달
 * i,j 변수는 사용하지 않는다 (헷갈릴 수 있기 때문에)
 * 
 * 










*/
public class 자바변수값변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=1000; System.out.println("a="+a); a=200; System.out.println("a="+a);
		 * a=300; System.out.println("a="+a);
		 */ /* -> a 값이 변하는거 */
		
	
	/*	int a=100;
		int b=a;
				System.out.println(b); a값을 b에 대입하는 식
			
	*/
	
		int b=200;
		int c=200;
		int d=b+c;
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		 int x,y,z;
		 x=y=z=100;
		 System.out.println("x="+x);
		 System.out.println("y="+y);
		 System.out.println("z="+z);
		 
	
	}

}
