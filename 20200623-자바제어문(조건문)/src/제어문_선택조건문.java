
/*
	�������ǹ�
	 if(���ǹ�)
	 	{
	 		���ǹ��� true�� �����ϴ� ���� ����
	 	}
	 else
	 {
	 	���ǹ���  false�϶� �����ϴ� ���� ����
	 	}

	���ǹ� => �ٽ� (���� ����)
		==, <, >, != -> ����
		&&, || -> ������ �������� ��
		
		ch>='A' && ch<='Z'
		ch>='0' && ch<='9'
		ch>='��' && ch<='�R'  => ��ȣ�� �Ϸ������� �迭�Ǿ���Ѵ�
			ex) 1,2,5,7,9
				ch==1 || ch==2 || ch==5 || ch==7 || ch==9
	���ڿ� ==> !=, ==�� ������� �ʰ�, equals()�� ���
			equals() =>  ����
			!equals() => ���� �ʴ�.

*/
import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �Ѱ��� �Է� �޾Ƽ� ���ĺ����� ����
		char ch='A';
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		ch=scan.next().charAt(0); //�ڹٴ� ��� ���۹�ȣ 0���� �����Ѵ� ex)"ABC"�̸� "A"�� ���
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
			System.out.println(ch+"��(��) ���ĺ��Դϴ�!");
		}
		else {
			System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�!");
		}
		
		int a;
	    a=scan.nextInt();
		
		System.out.print("�Է�ĭ");
		if(a>=0 && a<=9) {
			System.out.println(a+"��(��) �����Դϴ�");
		}
		else {
			System.out.println(ch+"��(��) ���ڰ� �ƴմϴ�!");
		}
		
		
		
	}

}
