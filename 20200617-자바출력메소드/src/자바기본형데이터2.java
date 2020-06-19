
/*

double d=123456.78
int a=(int)((d-123456)*100) -> 77
	why? double은 실수이기 때문에 77.9(.....16자리) -> 정수(77.999*100)=77




*/
public class 자바기본형데이터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("C:\\javaDev\\javaStudy\\20200617-자바출력메소드\\src\\자바기본형데이터2.java");
		System.out.println("\"홍길동\"");
		
		double d=123456.78;
		int a1=(int)((d-123456)*100);
		System.out.println(a1);
		
		
		
	}

}
