
import java.util.*; // Scanner -> 이전에 만들어진 자바파일을 읽어온다

public class 자바입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); System.out.println("정수입력:"); int
		 * a=scan.nextInt(); System.out.println("a="+a);
		 */ /*
			 * System.out.println("정수입력:"); = System.out.print("정수입력:\n"); 동일한 구조 입력값을 실수로
			 * 받고 싶을때, double scan.nextdouble();
			 */

		Scanner scan = new Scanner(System.in);
		System.out.println("실수입력:");
		double a = scan.nextDouble();
		System.out.println("a=" + a);

		System.out.println(Integer.toBinaryString(240));
		/*
 ============================================================================= ==============================
		 * 
		 * /*진법 
		 * 1.10진법  2.8진법  3.16진법  4.2진법
		 이진법이 필요하면 System.out.println(Integer.toBinaryString(숫자));
		 * 
		 * 
		 * 
		 */
	
		System.out.println(Integer.toBinaryString(240));
	
	
	}

}
