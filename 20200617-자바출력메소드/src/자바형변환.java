
/* ����ȯ => �ڽ��� ���������� �ٸ� ������ ������������ ��ȯ
 	%boolean�� ����
 	
 	byte < char < int < long < float < double
 	
 	��ȯ������ ����
 	���� 	=> �Ǽ�, ����, ����	int a=(int)10L
 	  	=> long a=(long)10 -->long a=10(�ڵ��� ��ȯ)	double d=(double)10
 				ex) double d=5/2; => Ans: 2.0 	(�Ǽ�/����=�Ǽ�)		 double d=5/(double)2 or dobule d=5/2.0; => Ans: 2.5
 	
 	�Ǽ� => ����, ����
	���� => ����, �Ǽ�
	
	
	1. �ڵ��� ��ȯ 
	  ex) 10.5 + 10 = 10.5 + 10.0 
	      'A'+1 = 65 + 1\\\
	      
	      
	     
	      
	      
	      
	      

*/

public class �ڹ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=a--;
		System.out.println(b);
	}

}
