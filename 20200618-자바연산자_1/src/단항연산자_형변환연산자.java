
/*
	����ȯ������: �ʿ�ÿ� ���������� �����ؼ� ���
		-> ���� ����ȯ (int)double => int -> ū �����͸� ���� �����ͷ� ����
					(char)int => char
			* boolean�� ����
			* int ���ϴ� ������ �ϸ� ������� int
				ex) byte + byte = int
					char + char = int
					short + byte = int
					char + byte + short = int
					
				byte b=10; byte c=20; byte d=b+c;(X) => error
				   -> 	byte b=10; byte c=20; int d=b+c;(O)


*/
public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ڵ� ����ȯ
		int a='A';
		double d=10;
		char c=65;
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//���� ����ȯ
		int i=(int)10.5;
		int ii='A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
		
		
	}

}
