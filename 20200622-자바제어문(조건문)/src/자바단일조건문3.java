
/* 조건문 제작하는 방법
	 if(조건문) : 조건문은 무조건 결과값 => true / False
	 ==> 필요한 경우(조건: true)에만 문장을 수행
	 	 False일 경우에는 건너뛴다. (문장을 수행하지 못한다)
	 	






*/
public class 자바단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		System.out.println("1");
		System.out.println("2");
		
		if(a%2==0)
		System.out.println("3"); //  이 문장에만 조건문이 걸림
		
		System.out.println("4");
		System.out.println("5");
		
		char alpha='k';
		if(alpha>='A'&& alpha<='Z')  // 범위지정
			System.out.println(alpha+"는(은) 대문자입니다");
		if(alpha>='a'&& alpha<='z')  // 범위지정
			System.out.println(alpha+"는(은) 소문자입니다");
		
		char alpha1='홍';
		if(alpha1>='A'&& alpha1<='Z')  // 범위지정
			System.out.println(alpha1+"는(은) 대문자입니다");
		if(alpha1>='a'&& alpha1<='z')  // 범위지정
			System.out.println(alpha1+"는(은) 소문자입니다");
		if(alpha1>='0'&& alpha1<='9')  // 범위지정
			System.out.println(alpha1+"는(은) 숫자입니다");
		if(alpha1>='가'&& alpha1<='힣')  // 범위지정
			System.out.println(alpha1+"는(은) 한글입니다");
		
		// 특수문자인 경우
		char alpha2='\t';
		if(alpha2=='\t'|| alpha2=='\n')  // 범위지정
			System.out.println("특수문자입니다");
		
		
	}

}
