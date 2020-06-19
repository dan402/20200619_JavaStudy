
/*
	부정 연산자 
	ex) if(!id) : id가 존재하지 않는다면
	=> true -> false, false -> true로 바꿔주는 것 결과값  boolean
	
		단항연산자 : 증감 -> int, 부정 -> boolean
		이항연산자 : 산술=> ? 어떠한 값이 나올지 모른다.	  ex)int + int = int, double + int = double
				   비교, 논리 => boolean
				   
		삼항연산자: 조건? 값1:값2
				 sex= 1? "남자":"여자"
				 sex= 1? 'M':'W'

*/
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bCheck=true;
		bCheck=!bCheck;
		bCheck=!bCheck;
		System.out.println("bCheck="+bCheck);
		
		
	}

}
