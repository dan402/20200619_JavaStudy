
/*
	���׿�����
		1)��� ������ => ������� �� �� ���� (�������� �ƴϱ� ������)
		2)�� ������ => true / false
		3)�� ������ => true / false
			=> �� �����ڿ� �� �����ڰ� ���� ���̴� �� : ���ǹ�(if)
		4)���� ������
	
	
	�񱳿����� : ���� ���� �� => ����, �Ǽ�, ����, ��
			 	*���ڿ��� ���� �� ����.  =>���ڿ��� �����ϴ� ��������: String
			 		ex) "Hello"=="Hello" ====> equals()
			 		
	1. ����
		== : ����  		ex) 10==20 (false)
		!= : ���� �ʴ�		ex) 10!=20 (true)
		< : �۴�			ex) 10<10  (false)
		> : ũ��			ex) 10>10  (false)
		<= : �۰ų� ����	ex) 10<=10 (true)
		>= : ũ�ų� ����	ex) 10>=10 (true)
	2. ����� : boolean



*/
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=9;
		char c='A';
		System.out.println(++c);
		System.out.println(c);
		System.out.println(++b==a);
		System.out.println(b++==a);
		
		
		System.out.println('A'==65); //*char�� ��������ϸ� ������ ��ȯ�ȴ�.
	
	}

}
