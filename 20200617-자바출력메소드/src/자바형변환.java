
/* 형변환 => 자신의 데이터형을 다른 형식의 데이터형으로 변환
 	%boolean은 제외
 	
 	byte < char < int < long < float < double
 	
 	변환가능한 유형
 	정수 	=> 실수, 문자, 정수	int a=(int)10L
 	  	=> long a=(long)10 -->long a=10(자동형 변환)	double d=(double)10
 				ex) double d=5/2; => Ans: 2.0 	(실수/정수=실수)		 double d=5/(double)2 or dobule d=5/2.0; => Ans: 2.5
 	
 	실수 => 정수, 문자
	문자 => 정수, 실수
	
	
	1. 자동형 변환 
	  ex) 10.5 + 10 = 10.5 + 10.0 
	      'A'+1 = 65 + 1\\\
	      
	      
	     
	      
	      
	      
	      

*/

public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=a--;
		System.out.println(b);
	}

}
