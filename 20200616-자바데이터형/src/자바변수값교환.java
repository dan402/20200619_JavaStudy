
/* 1. ��������(�ڷ���) : ����, �Ǽ�, ����, �� ���߿� ���ؼ� �� �Է�
 * ex) �¶��� �Ѿ˰���
    �Ѿ�-> x,y => ��ǥ (int or long), Ű���� ��(space, enterŰ) => char,  ������ ���� ��հ� -> double, ���� ���� ���� Ȯ�� => true/false => boolean
    
   2. ������ ���� ���
    1) �Ѱ� ���� => �����ؼ� ���(����): ��������+������,  ����x (���): final ��������+������
	2) ������ ���� => ���� ���� - �迭 , �ٸ� ���� - Ŭ����(��������� ��������)
	
   3. �޸𸮸� ����� ����(���� ����)
     1) ��������: ����(int, long), �Ǽ�(double),  ����(char), �� (boolean)
     
   4. ������ ���� �ʱⰪ ����
   
   5. ������ ����
      int a=10;
      a=100;
      a=200;
      a=300;
    
   6. ������ ������ ��ȯ => temp��� �Խú����� �ʿ�
   
    7. 25page ���� -> *������ ����Ģ*`
    
*/

public class �ڹٺ�������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int y=200;
		int temp=x;
		
		x=y;
		y=temp;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
