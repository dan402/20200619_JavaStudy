
/*
	*단일 조건문은 여러개를 사용해도 처음부터 마지막까지 수행된다.
	*수행문장이 1개일 경우 {}을 생략 가능 
	*세미클론은 if문 안이 아닌 출력 문에 찍어야 한다. -> ;를 찍는 건 단독 문장으로 무조건 수행한다.


*/
public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20; //3의배수, 5의배수, 7의배수
		if(a%3==0) // if(a%3==0); => if 문장이 종료
		{
			System.out.println(a+"는 3의 배수입니다"); //한문장
			System.out.println("if(a%3==0) 수행문장");
		}			// 두개 문장을 동시에 제어 +> 블록이 없으면 (a+"는 3의 배수입니다") 1문장 + "if(a%3==0) 수행문장" 1문장 총 2문장이 출력됨
			if(a%5==0)
			System.out.println(a+"는 5의 배수입니다"); //한문장
		if(a%7==0)
			System.out.println(a+"는 7의 배수입니다"); //한문장
	}

}
