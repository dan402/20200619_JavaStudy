
/*���� ���ǹ�: if ~ else
	1. ���� ex) �α��� ó��, ���̵� �ߺ�üũ, �۾���(����/���), ¦��/Ȧ��, ����(ó��/���), �빮��/�ҹ���
	 if(���ǹ�)
	 	{
	 		==> ������  true�϶� ó���ϴ� ����
	 		}
	  else
		{
	 		==> ������ false�϶� ó���ϴ� ����
	 		}


*/

import java.util.Scanner; // Ű����κ��� �Է°��� �޴´�.

public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner�� ���� => Ű������ �Է°��� �ִ� ��쿡 ó��
		Scanner scan=new Scanner(System.in); 
		// �ڹ��� ��� Ŭ����, ����� ���� Ŭ���� => �����Ҷ�, �ݵ�� new�� �̿��ؼ� ���� // System.in: ����� Ű���� �Է°��� �޴´�, System.out: ����Ϳ� ���
		System.out.print("������ �Է�(1~100):");
		int a=scan.nextInt(); // �Է°� �޾Ƽ� a��� �޸� ������ ����
		if(a<1 || a>100) // 1~100 ������ ������ �Էµ��� �ʾҴٸ�
			//  => true/false�� �ݴ�� ���������� if(!(a<1 || a>100));, if(a>1 && a<100)
		{
			System.out.println("�߸��� �Է��Դϴ�\n���α׷��� �����մϴ�");
		}
		
		else 
		{
			System.out.println(a+"�� �ԷµǾ����ϴ�~");
		}
	}

}
