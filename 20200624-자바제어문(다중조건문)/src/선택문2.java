/*
 * 
 * 
 */
import java.io.IOException;
import java.util.*;
public class ���ù�2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int menu=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("====== �޴� ======\nȨ(1)\n����󿵿�ȭ(2)\n��������(3)\n�ڽ����ǽ�(4)\n"
            +"��ȭ����(5)\n��ȭ����(6)\n================");
      System.out.println("�޴� �����ϼ���?");
      menu=scan.nextInt();
      switch (menu) {
      case 1:
         try {
            Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         break;
      case 2:
         
         break;
      case 3:
         
         break;
      case 4:
         
         break;
      case 5:
         
         break;
      case 6:
         
         break;
      default:
         System.out.println("�޴��� �������� �ʽ��ϴ�.");
      }
   }
   
   
   
}