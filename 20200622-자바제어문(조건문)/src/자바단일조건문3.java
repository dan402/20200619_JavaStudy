
/* ���ǹ� �����ϴ� ���
	 if(���ǹ�) : ���ǹ��� ������ ����� => true / False
	 ==> �ʿ��� ���(����: true)���� ������ ����
	 	 False�� ��쿡�� �ǳʶڴ�. (������ �������� ���Ѵ�)
	 	






*/
public class �ڹٴ������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		System.out.println("1");
		System.out.println("2");
		
		if(a%2==0)
		System.out.println("3"); //  �� ���忡�� ���ǹ��� �ɸ�
		
		System.out.println("4");
		System.out.println("5");
		
		char alpha='k';
		if(alpha>='A'&& alpha<='Z')  // ��������
			System.out.println(alpha+"��(��) �빮���Դϴ�");
		if(alpha>='a'&& alpha<='z')  // ��������
			System.out.println(alpha+"��(��) �ҹ����Դϴ�");
		
		char alpha1='ȫ';
		if(alpha1>='A'&& alpha1<='Z')  // ��������
			System.out.println(alpha1+"��(��) �빮���Դϴ�");
		if(alpha1>='a'&& alpha1<='z')  // ��������
			System.out.println(alpha1+"��(��) �ҹ����Դϴ�");
		if(alpha1>='0'&& alpha1<='9')  // ��������
			System.out.println(alpha1+"��(��) �����Դϴ�");
		if(alpha1>='��'&& alpha1<='�R')  // ��������
			System.out.println(alpha1+"��(��) �ѱ��Դϴ�");
		
		// Ư�������� ���
		char alpha2='\t';
		if(alpha2=='\t'|| alpha2=='\n')  // ��������
			System.out.println("Ư�������Դϴ�");
		
		
	}

}
