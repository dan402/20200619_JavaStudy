
/* �ڹ���¸޼ҵ�
 	1. ȭ����� 
 		1)  system.out.println() => ���� �ٿ� ����Ҷ�
 		     ex) Hello
 		         java
 		2)  system.out.print() =>  �ٷ� ���� ���
 			ex) Hello java 
 		3)  system.out.printf() => ������ �ִ� ���
			 ������ ���� %(���� n - ���� ����)d
			 	ex) %5d 80  => ooo80   %-5d => 80ooo
			 �Ǽ��� ���� %(m.n (m - ���� ����, n-�Ҽ��� ���ڸ�)f , ���� �Ҽ��� ���ڸ��� 5 �̻��̸� �ݿø���
			 	ex) %5.2f 80 => o80.00
			 ���ڰ� ���� %(���� n - ���� ����)c, ���ڿ�-%s			
			
			ex) 80 80 80 240  80.0  B
			system.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')

*/

public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello"); System.out.println("java");
		System.out.print("Hello");System.out.print("jaava");
		System.out.printf("%5d%5d%5d%7d%7.2f%5c",80,80,80,240, 80.0,'B');
				
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b);
	}

}
