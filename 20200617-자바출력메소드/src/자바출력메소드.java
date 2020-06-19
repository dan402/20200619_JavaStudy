
/* 자바출력메소드
 	1. 화면출력 
 		1)  system.out.println() => 다음 줄에 출력할때
 		     ex) Hello
 		         java
 		2)  system.out.print() =>  바로 옆에 출력
 			ex) Hello java 
 		3)  system.out.printf() => 서식이 있는 출력
			 정수가 들어가면 %(숫자 n - 띄어쓰기 단위)d
			 	ex) %5d 80  => ooo80   %-5d => 80ooo
			 실수가 들어가면 %(m.n (m - 띄어쓰기 단위, n-소수점 밑자리)f , 만약 소수점 뒷자리가 5 이상이면 반올림됨
			 	ex) %5.2f 80 => o80.00
			 문자가 들어가면 %(숫자 n - 띄어쓰기 단위)c, 문자열-%s			
			
			ex) 80 80 80 240  80.0  B
			system.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')

*/

public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello"); System.out.println("java");
		System.out.print("Hello");System.out.print("jaava");
		System.out.printf("%5d%5d%5d%7d%7.2f%5c",80,80,80,240, 80.0,'B');
				
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b);
	}

}
