
/* ���ù�
 	=> switch(����,����,���ڿ�)
 		1) ����
 	{
 		case ������:
 		 ó������
		case ������:
		 ó������ => �ߺ��� ���� ����� �� ����
		}
	switch(a){
	case1(��):				case1:
	case1: ==> ����		case2:	(O)

		ex) switch(����)  ==> break�� ���� ��쿡�� ��� ������ ����
		{
			case 1:
				ó������1
			case 2: 
				ó������2
				break;
			case 3:
				ó������3
		}
*/
import java.util.*;
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int select=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("����(1~5):");
		select=scan.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("1���� �Է��Ͽ����ϴ�");
			break; //switch���� �����Ѵ�
		case 2:
			System.out.println("2���� �Է��Ͽ����ϴ�");
			break;
		case 3:
			System.out.println("3���� �Է��Ͽ����ϴ�");
			break;
		case 4:
			System.out.println("4���� �Է��Ͽ����ϴ�");
			break;
		case 5:
			System.out.println("5���� �Է��Ͽ����ϴ�");
			break;
		default:
			System.out.println("1~5�������� ����ϼ���");
		}
	}

}
