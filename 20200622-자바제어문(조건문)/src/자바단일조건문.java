
/*

	제어문
	 1. 종류
	 	1) 조건문
	 		가. 단일 조건문: true or false 
	 				=> if (조건문)
	 		나. 선택 조건문: true일 경우-> 처리문장, false일 경우 -> 처리문장 	ex) 로그인 처리가 될 경우, 로그인 처리가 안된 경우
	 	 			=> if(조건문)
	 	 				조건이 true일 경우 (처리문장)
	 	 				else (조건이 false일 경우, 처리문장)
	 	 	다. 다중 조건문: 조건에 해당하는 문장만 수행 => 한번만 수행
	 	 			=> if(조건문)												
	 	 				실행문장1 => 조건이 true일때 수행하고 종료
	 	 			   else if(조건문)
	 	 			   	실행문장2 => 조건이 true일때 수행하고 종료
	 	 			   else if(조건문)
	 	 			   	실행문장3 => 조건이 true일때 수행하고 종료
	 	 			   else if(조건문)
	 	 			   	실행문장4 => 조건이 true일때 수행하고 종료
	 	 			   else
	 	 			   	실행문장5 => 조건이 해당하는 사항에 없는 경우
	 	 			   	
	 	 			  		ex) 정수입력 -> 3의 배수, 5의 배수, 7의 배수
	 	 			  			if(조건문)
	 	 			  			   실행문장
	 	 			  			if(조건문)
	 	 			  			   실행문장=====> 별도의 문장
	 	 			  			if(조건문)
	 	 			  			   실행문장   
	 	2) 선택문                                                                                                                                                                                                                                                                                                         
	 	3) 반복문
	 	4) 반복제어문
	 	
	 2. 형식
	 3. 흐름 이해
	 4. 구현

*/
public class 자바단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=56; // score가 60이상이면 성공, 60 이하면 실패
		if(score>=60)
		{
			System.out.println("첫번째 if문 수행");
			System.out.println("Success");
		}
			if(score<60)
		{
				System.out.println("두번째 if문 수행");
				System.out.println("Fail");
		}
		
		
		
	}

}
