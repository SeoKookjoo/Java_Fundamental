package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		char a = 'q'; //문자 표현법
		
		char name1 = '\uC11C'; //유니코드 표현법
		char name2 = '\uAD6D';
		char name3 = '\uC8FC';
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		char b = 97;
		System.out.print(b);
		System.out.print("\n성영한\t만세");
		System.out.print("\n성영한 \\ 만세"); // 문자열 중 \을 인식 못하므로 앞에 \ 붙임 -> 인식
		System.out.print("\n성영한 \" 만세"); // 문자열 중 "을 인식 못하므로 앞에 \ 붙임 -> 인식
		
		char c = '\\'; // \, ' 두 개의 문자는 인식 못하므로 앞에 \ 붙임 -> 인식
		char d = '\'';
		char e = '"';
		
		
	}
	
}
