
/*�ڹٿ��� �����ϴ� ���
 	1.���ǹ�, ���ù�
 		=���� ���ǹ�: if***
 		=���� ���ǹ�: if~else***
 			����) if(����)
 				{
 					������  true�� ��쿡 ó������
 					}
 		=���� ���ǹ�: if~else if~else if~else if~else***
 			����) if(���ǹ�)
 					{
 						������  true�� ��쿡 ó������  => ���� ����Ǹ� ����
 					}
 				else if(���ǹ�)
 					{
 						������  true�� ��쿡 ó������
 					}
 				else if(���ǹ�)
 					{
 						������  true�� ��쿡 ó������
 					}
 				else
 					{ 
 						�ش� ������ ���� ��쿡 ������ �����ϴ� ����
 					}
 		=���ù�: switch~case
 	2. �ݺ���
 		=�ݺ� Ƚ���� ������ ��� (for)***
 		=�ݺ� Ƚ���� ������ �ȵ� ��� (while)***
 		=�ݵ�� �ѹ� �̻� ���� (do~while)
 	3. �ݺ� ���	
 		= break : �ݺ��� ����***
 		= continue : Ư�� �κ��� ����
 
*/

import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		char op='+';

		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		a=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		b=scan.nextInt();
		System.out.print("������(+,-,*,/):");
		op=scan.next().charAt(0); 
		//Scanner�� char�� �޾Ƽ� ó���ϴ� ����� ���� =>���� ���ڿ��� �޾ƾ���
		//System.in => ����ó���� �ݵ�� �ؾ� �Ѵ�.
		
		if(op=='+');
		{
			System.out.printf("%d-%d=%d\n",a,b,a+b);
		}
		if(op=='-');
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*');
		{
			System.out.printf("%d-%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			if(b==0)
			{
			System.out.printf("0���� ������ �����ϴ�");
			}
			else
			{
				System.out.printf("%d-%d=%.2f\n",a,b,a/(double)b);
			}
		}
		
		/*
		 * main => end =====> ���α׷� ����
		 * main: ���α׷� ����
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	
	
	
	
	
	}

}
