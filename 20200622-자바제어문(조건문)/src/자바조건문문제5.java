
/*
char ���� ���� => ���� ����

=> char alpha='A'
	=> alpha�� �빮�ڸ� �ҹ��� ���
	   alpha�� �ҹ��ڸ� �빮�� ���

	1. ���
		������(�� ������, ��������, ����������)
			��. �񱳿�����
			��. �������� 
				- &&(����)-> �Ⱓ�̳� ��������, ���� && ���� => ������ �Ѵ�  true�϶��� ����ó��
				- ||(������)
			��. ����������: �ݴ�(!)
		�ܵ�ó�� => ���������, ����������, ���Կ�����=======> ���� => ���
		����ó�� => ����ȯ (���� ����ȯ)
		 double => int----> (int)double
		 int => char -----> (char)int
		 
		 
*/


public class �ڹ����ǹ�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char alpha='K';
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println((char)(alpha+32));
		}
		if(alpha>='a' && alpha<='z')
		{
			System.out.println((char)(alpha-32));
		}
	
	}

}
