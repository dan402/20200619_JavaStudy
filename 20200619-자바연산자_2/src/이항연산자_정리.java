
/*
		 �����, ���� ����ϴ� ������
		 	1) ���������� (++,--)
		 	2) ���������(+,-,*,/)
		 	3) �񱳿�����, ��������
		 	4) ���Կ����� (=, +=, -=)
		 	
		 	
		 ��Ÿ������
		  - ���׿����� : ����? ��1:��2  ==> if~else  => ���ӿ��� ���� ���
				true = ��1, false = ��2
			

*/

import java.util.*; //import java.lang.* => system, string, math 
public class ���׿�����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ �Է¹޾Ƽ� ¦������ Ȧ������ �Ǻ�
		  Scanner scan=new Scanner(System.in);  //system. in => Ű���� �Է°�, system.out => ȭ��
		  System.out.println("�����Է�:");  
		  int a=scan.nextInt();  //�Է¹��� ������ ����
		  System.out.println(a%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
		  
		  int a1=(int)(Math.random()*100)+1;
		 /*// 	 =====------------------ >>	
		  			��		��			  ��
		  	������ �켱����
		  	 1) ��ȣ
		  	 2) ���׿�����
		  	 3) ���׿�����	
		 */ 
	
		  System.out.println("a1="+a1);
		  System.out.println(a%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
		  
		  
		
	}

}
