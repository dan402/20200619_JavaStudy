/*
	�����=> �����Է�(1~12)
	12, 1, 2 => �ܿ��Դϴ�
	3, 4, 5 => ���Դϴ�
	6,7,8 => �����Դϴ�.
	9, 10, 11 => �����Դϴ�.
*/

import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�(1~12):");
	
		int month=scan.nextInt();
		if(month==12 || month==1 || month==2) {
			System.out.printf("�ܿ��Դϴ�");
		}
		else if (month==3 || month==4 || month==5) {
			System.out.printf("���Դϴ�");
		}
		else if (month==6 || month==7 || month==8) {
			System.out.printf("�����Դϴ�");
		}
		else if (month==9 || month==10 || month==11) {
			System.out.printf("�����Դϴ�");
		}
		else
		{
		}

		/*���ڸ� �Է¹޾Ƽ� char ch
			=���� ch>='0' && ch<='9'
			=���ĺ� ch>='A' && ch<='Z' || ch>='a' && ch<='z'
			=�ѱ� ch>='��' && ch<='�R'
			=Ư�� ����
		*/
		char ch=0;
		System.out.println("���ڸ� �Է��ϼ���:");
		ch=scan.next().charAt(0);
			
			
		if(ch>='0' && ch<='9') {
			System.out.println(ch+"�����Դϴ�");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println(ch+"���ĺ� �빮���Դϴ�");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println(ch+"���ĺ� �ҹ����Դϴ�");
		}
		else if(ch>='��' && ch<='�R') {
			System.out.println(ch+"�ѱ��Դϴ�");
		}
		else {
			System.out.println("Ư�������Դϴ�");
		}
		
		
	}

}
