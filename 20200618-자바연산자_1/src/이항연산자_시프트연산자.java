
/*
	����Ʈ������  << , >>
	: ��Ʈ �̵� ������
		<< : ��Ʈ �������� �̵��Ҷ� ���鿡 0���� ä�� 
				=> �����: x<<y -> x*2^y(x*2�� y����)
			ex) 10<<2
				1010 => 10
			  	<<10 => 101000 = 40
		
		>> : ��Ʈ ���������� �̵��Ҷ�, ������ ����
				=> �����: x>>y -> x/2^y (x/2�� y����)
			ex) 10>>2
				1010 => 10
				>>1010 => 10 = 2
				
				
				
				
				
				
				
		
		ex1) 8<<3							8>>3
			1000 => 1000000 = 64			1000 = > 1 = 1
			
			



*/
public class ���׿�����_����Ʈ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=2;
		System.out.println(x/2^y);
		
		System.out.println(10>>2);
	}

}
