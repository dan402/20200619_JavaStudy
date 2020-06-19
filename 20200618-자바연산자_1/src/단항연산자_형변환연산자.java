
/*
	형변환연산자: 필요시에 데이터형을 변경해서 사용
		-> 강제 형변환 (int)double => int -> 큰 데이터를 작은 데이터로 변경
					(char)int => char
			* boolean은 제외
			* int 이하는 연산을 하면 결과값이 int
				ex) byte + byte = int
					char + char = int
					short + byte = int
					char + byte + short = int
					
				byte b=10; byte c=20; byte d=b+c;(X) => error
				   -> 	byte b=10; byte c=20; int d=b+c;(O)


*/
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 형변환
		int a='A';
		double d=10;
		char c=65;
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//강제 형변환
		int i=(int)10.5;
		int ii='A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
		
		
	}

}
