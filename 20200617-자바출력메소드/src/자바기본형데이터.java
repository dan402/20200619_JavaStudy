
/* å p.55
	�ڹٿ��� �����ϴ� �������� -> �⺻��
	1. ���� => boolean -> ��: True / False : if(���ǹ�)�� ����Ҷ� �ַ� ����ϴ� ��������, ��(term:����)
	2. 
 	 double d='a'  =>d=97.0 : �ڵ����� ���ں�ȯ (��ĳ����), �����ڰ� ������ ��ȯ (�ٿ�ĳ����)
 	 
 	 byte b1=10;									byte a=10;
 	 byte b2=20;									byte b=30;
 	 byte b3=b1+b2 (x) -> error						byte c=(byte)(a*b) = ��: 44
 	 
 	 ============>upcasting(�ڵ�����ȯ)
 	 byte < Short(char) < int < long < float < double
		<================= downcasting(��������ȯ)

*/

public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean b1=false; // true,false�� �׻� �ҹ��ڷ� =>1byte, boolean�� �ܵ� ���
		 System.out.println("b1="+b1);
		 b1=true;
		 System.out.println("b1="+b1);

			byte a=10;
			byte b=30;
			int c=a*b;
			System.out.println("c="+c);

			System.out.println('A');
			System.out.println((int)'��'); //12619 => '��' �� ���ڴ� ���� ��ȣ�� ������ �ִ� (char�� ���������� �ν��Ѵ�)
			System.out.println((char)12619);
	
			
			
	}
		
	
	
	
}
