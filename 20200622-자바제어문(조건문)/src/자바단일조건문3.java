
/* Á¶°Ç¹® Á¦ÀÛÇÏ´Â ¹æ¹ý
	 if(Á¶°Ç¹®) : Á¶°Ç¹®Àº ¹«Á¶°Ç °á°ú°ª => true / False
	 ==> ÇÊ¿äÇÑ °æ¿ì(Á¶°Ç: true)¿¡¸¸ ¹®ÀåÀ» ¼öÇà
	 	 FalseÀÏ °æ¿ì¿¡´Â °Ç³Ê¶Ú´Ù. (¹®ÀåÀ» ¼öÇàÇÏÁö ¸øÇÑ´Ù)
	 	






*/
public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		System.out.println("1");
		System.out.println("2");
		
		if(a%2==0)
		System.out.println("3"); //  ÀÌ ¹®Àå¿¡¸¸ Á¶°Ç¹®ÀÌ °É¸²
		
		System.out.println("4");
		System.out.println("5");
		
		char alpha='k';
		if(alpha>='A'&& alpha<='Z')  // ¹üÀ§ÁöÁ¤
			System.out.println(alpha+"´Â(Àº) ´ë¹®ÀÚÀÔ´Ï´Ù");
		if(alpha>='a'&& alpha<='z')  // ¹üÀ§ÁöÁ¤
			System.out.println(alpha+"´Â(Àº) ¼Ò¹®ÀÚÀÔ´Ï´Ù");
		
		char alpha1='È«';
		if(alpha1>='A'&& alpha1<='Z')  // ¹üÀ§ÁöÁ¤
			System.out.println(alpha1+"´Â(Àº) ´ë¹®ÀÚÀÔ´Ï´Ù");
		if(alpha1>='a'&& alpha1<='z')  // ¹üÀ§ÁöÁ¤
			System.out.println(alpha1+"´Â(Àº) ¼Ò¹®ÀÚÀÔ´Ï´Ù");
		if(alpha1>='0'&& alpha1<='9')  // ¹üÀ§ÁöÁ¤
			System.out.println(alpha1+"´Â(Àº) ¼ýÀÚÀÔ´Ï´Ù");
		if(alpha1>='°¡'&& alpha1<='ÆR')  // ¹üÀ§ÁöÁ¤
			System.out.println(alpha1+"´Â(Àº) ÇÑ±ÛÀÔ´Ï´Ù");
		
		// Æ¯¼ö¹®ÀÚÀÎ °æ¿ì
		char alpha2='\t';
		if(alpha2=='\t'|| alpha2=='\n')  // ¹üÀ§ÁöÁ¤
			System.out.println("Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù");
		
		
	}

}
