
/*
	º±≈√¡∂∞«πÆ
	 if(¡∂∞«πÆ)
	 	{
	 		¡∂∞«πÆ¿Ã true∏È ºˆ«‡«œ¥¬ πÆ¿Â ±∏«ˆ
	 	}
	 else
	 {
	 	¡∂∞«πÆ¿Ã  false¿œ∂ß ºˆ«‡«œ¥¬ πÆ¿Â ±∏«ˆ
	 	}

	¡∂∞«πÆ => «ŸΩ… (¡∂∞« ¡¶¿€)
		==, <, >, != -> ¥‹¿œ
		&&, || -> ¡∂∞«¿Ã ø©∑Ø∞≥¿œ ∂ß
		
		ch>='A' && ch<='Z'
		ch>='0' && ch<='9'
		ch>='∞°' && ch<='∆R'  => π¯»£∞° ¿œ∑¸¿˚¿∏∑Œ πËø≠µ«æÓæﬂ«—¥Ÿ
			ex) 1,2,5,7,9
				ch==1 || ch==2 || ch==5 || ch==7 || ch==9
	πÆ¿⁄ø≠ ==> !=, ==¿ª ªÁøÎ«œ¡ˆ æ ∞Ì, equals()∏¶ ªÁøÎ
			equals() =>  ∞∞¥Ÿ
			!equals() => ∞∞¡ˆ æ ¥Ÿ.

*/
import java.util.*;
public class ¡¶æÓπÆ_º±≈√¡∂∞«πÆ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// πÆ¿⁄ «—∞≥∏¶ ¿‘∑¬ πﬁæ∆º≠ æÀ∆ƒ∫™¿Œ¡ˆ ø©∫Œ
		char ch='A';
		Scanner scan=new Scanner(System.in);
		System.out.print("πÆ¿⁄¿‘∑¬:");
		ch=scan.next().charAt(0); //¿⁄πŸ¥¬ ∏µÁ Ω√¿€π¯»£ 0∫Œ≈Õ Ω√¿€«—¥Ÿ ex)"ABC"¿Ã∏È "A"∏¶ √‚∑¬
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
			System.out.println(ch+"¥¬(¿∫) æÀ∆ƒ∫™¿‘¥œ¥Ÿ!");
		}
		else {
			System.out.println(ch+"¥¬(¿∫) æÀ∆ƒ∫™¿Ã æ∆¥’¥œ¥Ÿ!");
		}
		
		int a;
	    a=scan.nextInt();
		
		System.out.print("¿‘∑¬ƒ≠");
		if(a>=0 && a<=9) {
			System.out.println(a+"¥¬(¿∫) º˝¿⁄¿‘¥œ¥Ÿ");
		}
		else {
			System.out.println(ch+"¥¬(¿∫) º˝¿⁄∞° æ∆¥’¥œ¥Ÿ!");
		}
		
		
		
	}

}
