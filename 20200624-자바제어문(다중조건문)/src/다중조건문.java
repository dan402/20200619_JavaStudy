/*
 *    ���� ���ǹ� => ������ ���� ��쿡 ���
 *   ========= ������ �´� ���常 ����(1���� ����)
 *   int a = 15;
 *   if( a%3 == 0 )
 *      System.out.println("3�ǹ��");
 *   else if( a%5 == 0 )
 *      System.out.println("5�ǹ��");
 *   else if( a%7 == 0 )
 *      System.out.println("7�ǹ��");
 *   ================================
 *   if( a%3 == 0 )
 *      System.out.println("3�ǹ��");
 *  ================================
 *   if( a%5 == 0 )
 *      System.out.println("5�ǹ��");
 *  ================================
 *   if( a%7 == 0 )
 *      System.out.println("7�ǹ��");
 *   ================================
 *   ====================
 *   ���� 
 *   if(���ǽ�){
 *      ������ true�� �����ϴ� ����
 *      �����Ŀ� ����
 *   }
 *   else if(���ǽ�){
 *   
 *   }
 *   else if(���ǽ�){
 *   
 *   }
 *    else if(���ǽ�){
 *   
 *   }
 *    else if(���ǽ�){
 *   
 *   }
 *    else if(���ǽ�){
 *   
 *   }
 *   ====================
 *
 *
 * ���� ��� ==>
 * 
 *    3���� ������ �޾Ƽ�
 *    ����, ���, ���� ===>
 */   
import java.util.*;
public class �������ǹ� {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      // ���� ��������� ���� 
      int kor=0,eng=0,math=0;
      int total=0;
      double ave=0.0;
      char hakjum='A';
      
      //  �Է��� �޴´� => ������ ����
      Scanner scan = new Scanner(System.in);
      System.out.print("���� ���� �Է� : \n");
      kor = scan.nextInt();
      System.out.print("���� ���� �Է� : \n");
      eng = scan.nextInt();
      System.out.print("���� ���� �Է� : \n");
      math =scan.nextInt();
      total = kor + eng  +math ;
      ave = total/3.0;
      
      if(ave>=90) {
         hakjum='A';
      }
      else if(ave>=80) {
         hakjum='B';
      }
      else if(ave>=70) {
         hakjum='C';
      }
      else if(ave>=60) {
         hakjum='D';
      }
      else {
         hakjum='F';
      }
      System.out.println("======����======");
      System.out.println("��������  :"+kor);
      System.out.println("��������  :"+eng);
      System.out.println("��������  :"+math);
      System.out.println("����  :"+total);
      System.out.printf("���  : %.2f \n",ave);
      System.out.println("���� :"+hakjum);
      // 1. ����
      // 2. ���
      // 3. ����
      // 4. ó���� �Ϸ� ==> ȭ�鿡 ���
      /*
       * 1. ������ ����
       *     ======== 
       *       1) ����ڰ� ��û ==> �ַ� ���
       *       2) File �б�
       *       3) ����Ŭ ����
       *       4) ���� �ִ� ������ �б�
       * 
       * 2. ����� ��û�� ������ ==> ������ ����
       * 
       * 3. ����ڿ��� ������ ������ ��� 
       */
   }

}