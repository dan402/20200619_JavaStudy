import java.util.Scanner;

/// 1. \n (new line) - �����ٿ� ����϶� ���
//	2. \t (tap) - ���������� ��

/*Scanner scan=new Scanner(System.in);
/* Scanner : ��������
 * scan : ����
 * new: �޸𸮿� ���� -> �޼ҵ忡�� �����ڷ� �°�
 * Scanner(System.in) : �ʱ�ȭ
 *
 * 3. �ڹ��� ����
 * import
     ��
 * package : ���� Ŭ������ �� ������ ��Ƽ� ����
     ��
 * Public class
    
       ex) import java.util.Scanner; -> util ���� Ŭ���� �ϳ� �������°�
           import java.util.*; -> util ���� �������� Ŭ������ �ҷ����°� 
  
  
 * 
*/

import java.util.Scanner;

public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d*%d=%d\n",2,2,4);
		System.out.printf("%d*%d=%d",2,3,6);

		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.print("1' �����Է�:");
	
		
		int a=scan.nextInt();	//  �Էµ� ������ �о�ͼ� a�޸𸮿� ����
		int b=scan.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// Scanner => ���������� ���
	}

}
