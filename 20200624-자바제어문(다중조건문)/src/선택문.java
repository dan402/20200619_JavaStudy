
/* 선택문
 	=> switch(정수,문자,문자열)
 		1) 정수
 	{
 		case 정수값:
 		 처리문장
		case 정수값:
		 처리문장 => 중복된 값은 사용할 수 없다
		}
	switch(a){
	case1(라벨):				case1:
	case1: ==> 오류		case2:	(O)

		ex) switch(정수)  ==> break가 없는 경우에는 모든 문장을 수행
		{
			case 1:
				처리문장1
			case 2: 
				처리문장2
				break;
			case 3:
				처리문장3
		}
*/
import java.util.*;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int select=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수(1~5):");
		select=scan.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("1번을 입력하였습니다");
			break; //switch문을 종료한다
		case 2:
			System.out.println("2번을 입력하였습니다");
			break;
		case 3:
			System.out.println("3번을 입력하였습니다");
			break;
		case 4:
			System.out.println("4번을 입력하였습니다");
			break;
		case 5:
			System.out.println("5번을 입력하였습니다");
			break;
		default:
			System.out.println("1~5번까지만 사용하세요");
		}
	}

}
