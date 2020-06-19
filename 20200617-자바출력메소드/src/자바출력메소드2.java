import java.util.Scanner;

/// 1. \n (new line) - 다음줄에 출력하라 명령
//	2. \t (tap) - 일정간격을 띄울떄

/*Scanner scan=new Scanner(System.in);
/* Scanner : 데이터형
 * scan : 변수
 * new: 메모리에 저장 -> 메소드에서 연산자로 승격
 * Scanner(System.in) : 초기화
 *
 * 3. 자바의 구조
 * import
     ↓
 * package : 관련 클래스를 한 군데로 모아서 저장
     ↓
 * Public class
    
       ex) import java.util.Scanner; -> util 안의 클래스 하나 가져오는거
           import java.util.*; -> util 안의 여러개의 클래스를 불러오는것 
  
  
 * 
*/

import java.util.Scanner;

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d*%d=%d\n",2,2,4);
		System.out.printf("%d*%d=%d",2,3,6);

		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.print("1' 정수입력:");
	
		
		int a=scan.nextInt();	//  입력된 정수를 읽어와서 a메모리에 저장
		int b=scan.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// Scanner => 도스에서만 사용
	}

}
