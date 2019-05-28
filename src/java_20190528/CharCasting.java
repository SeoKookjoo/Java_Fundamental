package java_20190528;

public class CharCasting {
	public static void main(String[] args){
		// byte 범위를 넘어가면 에러 발생
		// circuit 발생
		byte a = (byte)128;
		System.out.println(a);
		
		// float, double로 캐스팅하는 경우 소수점 이하 짤림
		// cut 발생
		int b = (int)42.5;
		System.out.println(b);
		
		float c =(float)42 / (float)4;
		System.out.println(c);
		
	}
	
}
