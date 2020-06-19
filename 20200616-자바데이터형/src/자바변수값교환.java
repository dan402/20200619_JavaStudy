
/* 1. 데이터형(자료형) : 정수, 실수, 문자, 논리 넷중에 정해서 값 입력
 * ex) 온라인 총알게임
    총알-> x,y => 좌표 (int or long), 키보드 값(space, enter키) => char,  점수에 대한 평균값 -> double, 게임 종료 여부 확인 => true/false => boolean
    
   2. 데이터 저장 방법
    1) 한개 저장 => 변경해서 사용(변수): 데이터형+변수명,  변경x (상수): final 데이터형+변수명
	2) 여러개 저장 => 같은 유형 - 배열 , 다른 유형 - 클래스(사용자정의 데이터형)
	
   3. 메모리를 만드는 형식(변수 선언)
     1) 데이터형: 정수(int, long), 실수(double),  문자(char), 논리 (boolean)
     
   4. 변수에 대한 초기값 설정
   
   5. 변수값 변경
      int a=10;
      a=100;
      a=200;
      a=300;
    
   6. 변수와 변수의 교환 => temp라는 입시변수가 필요
   
    7. 25page 참조 -> *변수명 명명규칙*`
    
*/

public class 자바변수값교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int y=200;
		int temp=x;
		
		x=y;
		y=temp;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
