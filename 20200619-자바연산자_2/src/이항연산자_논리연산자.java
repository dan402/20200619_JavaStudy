
/*
	��������
	1. ����
		1) && (�ص�) : ���Ŀ����� => �ΰ��� true  =>  ����, �Ⱓ�� �����Ҷ� ���
		2) || (����) : ���Ŀ����� => �Ѱ� �̻��� true => ������ �Ⱓ�� ����� ��쿡 �ַ� ���
			ex) jumsu>=90 (&&) jumsu <=100 
				jumsu<=0 (||) jumsu > 100
				���� (&&, || ), ����  => true / false 
			
								&&			  ||
			true true		   true			 true
			true false		   false		 true 
			false true		   false		 true
			false false		   false		 false
			==============================================
			
			ex) 6<5 && 10 == 10
				false && true => false
				
		ȿ������ ����
		1) && ���ʿ� �ִ� ������  false��, ������ ������ ���� �ʴ´�.
		2) || ���ʿ� �ִ� ������  true��, ������ ������ ���� �ʴ´�.
		int a=10;
		int b=9;
		
		a<b && ++b==a  => a<b�� false �̸� �� ���� ������� �ʴ´�.

*/

public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1='A';
		int i=65;
		char c2='B';
		
		System.out.println(c1==i || ++c1==c2);
		
	}

}
