
/* �����ʱ�ȭ
  1. ����ó�� : int a=100;
  2. ���� -> Ű���忡�� �޾Ƽ� ���� 
  3. ������ ���� ���� (����) => ����, �ζ� �� ���� ��÷���
  4. �Է� â�� ���� ���� �޴� ��� 

 * �ʱ�ȭ���
  1. ���� ���ÿ� �ʱⰪ �ο� => �����ڿ����� ���� ���
     int a=100;
  2. �����ϰ� ���߿� �ʱⰪ�� �ο�  => ����ڿ� ���߿� ���� ���
  	 int a;
  	 a=200;
  	
  	 
*/

import java.util.*;
// String, System, Math => java.lang => ������ ���� 


public class �ڹٺ����ʱ�ȭ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println("a="+a);
		
		int b;
		b=200;
		System.out.println("b="+b);
		
		int c;
		c=(int)(Math.random()*100)+1;  //���� -> ����ó��
		// Math.random => 0.0 ~ 0.99 *100 => int�� ��ȯ�ϸ� 0~99 =>+1�ϸ� 1~100 ������ ���� ǥ��
		System.out.println("c="+c);
		
	/*	
		int d;
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�:"); */
	
	}
	
}