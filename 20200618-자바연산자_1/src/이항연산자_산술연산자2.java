
/* 1. 데이터형을 초과하면  error가 아닌 오버플로워를 발생
		오버플로워 : 내가 원하지 않은 값이 들어왔을때
		ex) int => 1~10		11=> 1로 출력
				*오버플로워가 되면 음수로 결과값이 출력될 수 있음  ->양수+양수=음수가 나온 경우
						byte b1=64;
						byte b2=64;
						byte b3=(byte)(b1+b2);
						System.out.println("b3="+b3); Ans : -128
		% 나누고 나머지값 = > double+int+char => double
		
	2. 같은 데이터형만 연산이 가능
			1)자동 형변환
				ex) 10+10.5 => int + double => 10.0 + 10.5 = 20.5 (double)
					'A'+1 => char + int = 65+1 = 66 (int)
			2)강제 형변환
				ex) (int)(10.5+10.5) => int(21.0) => Ans: 21
					  ②  	  ①
					(int)10.5+(int)10.5 => 10+10 =>  Ans: 20
					   ①		 ②
					  
					  
					  
*/					
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1=64;
		byte b2=64;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3);
		
		int a=5;
		int b=2;
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);
		System.out.println(-a%-b);

	}

}
