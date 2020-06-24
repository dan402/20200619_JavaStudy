/*
 * 
 * 
 */
import java.io.IOException;
import java.util.*;
public class 선택문2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int menu=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("====== 메뉴 ======\n홈(1)\n현재상영영화(2)\n개봉예정(3)\n박스오피스(4)\n"
            +"영화예매(5)\n영화뉴스(6)\n================");
      System.out.println("메뉴 선택하세요?");
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
         System.out.println("메뉴가 존재하지 않습니다.");
      }
   }
   
   
   
}