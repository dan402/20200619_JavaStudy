
/* 1. ���������� �ʰ��ϸ�  error�� �ƴ� �����÷ο��� �߻�
		�����÷ο� : ���� ������ ���� ���� ��������
		ex) int => 1~10		11=> 1�� ���
				*�����÷ο��� �Ǹ� ������ ������� ��µ� �� ����  ->���+���=������ ���� ���
						byte b1=64;
						byte b2=64;
						byte b3=(byte)(b1+b2);
						System.out.println("b3="+b3); Ans : -128
		% ������ �������� = > double+int+char => double
		
	2. ���� ���������� ������ ����
			1)�ڵ� ����ȯ
				ex) 10+10.5 => int + double => 10.0 + 10.5 = 20.5 (double)
					'A'+1 => char + int = 65+1 = 66 (int)
			2)���� ����ȯ
				ex) (int)(10.5+10.5) => int(21.0) => Ans: 21
					  ��  	  ��
					(int)10.5+(int)10.5 => 10+10 =>  Ans: 20
					   ��		 ��
					  
					  
					  
*/					
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1=64;
		byte b2=64;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3);
		
		int a=5;
		int b=2;
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);
		System.out.println(-a%-b);

	}

}
