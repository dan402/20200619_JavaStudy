/*
	»ç¿ëÀÚ=> Á¤¼öÀÔ·Â(1~12)
	12, 1, 2 => °Ü¿ïÀÔ´Ï´Ù
	3, 4, 5 => º½ÀÔ´Ï´Ù
	6,7,8 => ¿©¸§ÀÔ´Ï´Ù.
	9, 10, 11 => °¡À»ÀÔ´Ï´Ù.
*/

import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Á¤¼öÀÔ·Â(1~12):");
	
		int month=scan.nextInt();
		if(month==12 || month==1 || month==2) {
			System.out.printf("°Ü¿ïÀÔ´Ï´Ù");
		}
		else if (month==3 || month==4 || month==5) {
			System.out.printf("º½ÀÔ´Ï´Ù");
		}
		else if (month==6 || month==7 || month==8) {
			System.out.printf("¿©¸§ÀÔ´Ï´Ù");
		}
		else if (month==9 || month==10 || month==11) {
			System.out.printf("°¡À»ÀÔ´Ï´Ù");
		}
		else
		{
		}

		/*¹®ÀÚ¸¦ ÀÔ·Â¹Þ¾Æ¼­ char ch
			=¼ýÀÚ ch>='0' && ch<='9'
			=¾ËÆÄºª ch>='A' && ch<='Z' || ch>='a' && ch<='z'
			=ÇÑ±Û ch>='°¡' && ch<='ÆR'
			=Æ¯¼ö ¹®ÀÚ
		*/
		char ch=0;
		System.out.println("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä:");
		ch=scan.next().charAt(0);
			
			
		if(ch>='0' && ch<='9') {
			System.out.println(ch+"¼ýÀÚÀÔ´Ï´Ù");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println(ch+"¾ËÆÄºª ´ë¹®ÀÚÀÔ´Ï´Ù");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println(ch+"¾ËÆÄºª ¼Ò¹®ÀÚÀÔ´Ï´Ù");
		}
		else if(ch>='°¡' && ch<='ÆR') {
			System.out.println(ch+"ÇÑ±ÛÀÔ´Ï´Ù");
		}
		else {
			System.out.println("Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù");
		}
		
		
	}

}
