package java_20190528;

public class OperatorDemo {
	public static void main(String[] args){
		/* 달력 만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 윤년은 4년 마다 발생하고 그 중에 100의 배수는 제외하고 400의 배수는 포함한다
		 * 3. 2019년 5월 28일의 요일을 구하려면
		 * 	2018년까지 총 일수 구하기
		 * 	4월까지 총 일수 구하기
		 * 	28일 더하면 총 일수가 나옴
		 * 4. 총 일수를 7로 나눈 나머지가 1이면 월요일, 2이면 화요일 ... 6이면 토요일, 0이면 일요일
		 */
		
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;
		
		totalCnt = preYear * 365 + (preYear/4) - (preYear/100) + (preYear/400);
		totalCnt += (31+28+31+30);
		totalCnt += date;

		System.out.print(totalCnt%7);
		
		
		int a =10;
		System.out.println(a++);
		System.out.println(++a);
		
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10 + 1;
		
		
	}
}
