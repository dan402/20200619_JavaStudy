
/*
	���� ������: ������� �޴´�
		1. ����
			= => int a=10 (10�� a��� �޸𸮿� �����Ѵ�)
			 1) ���մ��Կ�����
				op= : op(������)	
					+= => int a=10; a+=2; => a=a+2 => a=12
					-= => int a=10; a-=5 => a=a-5 => a=5
					*= => int a=10; a*=5; => a=a*5 => a=50
				 	/= => int a=10; a/=3; => a=a/3 => a=3
				  	%= => int a=10; a%=3; => a=a%3 => a=1
				  	|= => int a=10; a|=3; => 1010 | 0011 => 1011 => a=11
				  	&= => int a=10; a&=3; => 1010 * 0011 => 0010 => a=2
				  	<<= => int a=10; a<<=3; => 1010000 => 10*2^3 => a=80
				  	>>= => int a=10; a>>=3; => 
				  	
				  	10/2^3 => a=1
				  	
						*�Ѱ��� ������ ��: ���� ������ => a++, ++a, a+=1, a=a+1
						*���ϴ� ������ŭ ���� : ���� ���Կ�����
				
			
		
*/


public class ���׿�����_���Կ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a+=5;
		System.out.println("a="+a);  //=> a���� 5�� ���Ѵ�
		
		int b=10;
		b-=5;
		System.out.println("b="+b);  //=> b���� 5�� ����
		
		int c=10;
		c=c*5;
		System.out.println("c="+c);
		
		int d=10;
		d/=3;
		System.out.println("d="+d);
		
	}

}
