
/*
	ex) ����ڰ� �⵵�� �Է��ϸ� ���⿩�� Ȯ��
		=> ���� 1. 4�⸶�� 1���� => year%4==0
		=> ���� 2. 100�⸶�� ���� ==> year%4==0
		=> ���� 3. 400�⸶�� ���� ===> year%400==0
		
			����: if((year%4==0 && year%4==0 || (year%400==0))
			
		- ����, �Ⱓ�� ���� => &&
		- ����, �Ⱓ�� ������ �ȵ� ��� ==> ||
		- ���ܽ�Ű�� ��� ===> &&
		
*/

import java.util.*;
public class �ڹټ������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵�Է�"); // �Է°��� �޾Ƽ� year ����
		year=scan.nextInt();
		
		//���� ���θ� Ȯ��
			if((year%4==0 && year%4==0 || (year%400==0))) // �����̶��
			{
				System.out.println(year+"��(��) �����Դϴ�");
			}
			else
			{
				System.out.println(year+"��(��) ������ �ƴմϴ�");
			}
	}

}