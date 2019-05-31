package java_20190529;

public class Calender {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WENDESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
			
		public void print(int year){
			
		}
		public void print(int year, int month){
			
		}
		public void print(int year, int month, int day)
		{
		int preYear = year -1;
		int preMonth = month -1;
		
		int totalCnt = 0;
		
		totalCnt = preYear * 365 + (preYear/4) - (preYear/100) + (preYear/400);

		int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0 ; i < preMonth ; i++){
			totalCnt += monthArray[i];
		}
		
		if(year%4==0 && year%100!=0 || year%400==0){
			totalCnt++;
		}
		
		totalCnt += day;
		int rest = totalCnt % 7;
		String dayOfWeek = "";
		switch(rest){
		case Calender.MONDAY : dayOfWeek = "������";  break;
		case Calender.TUESDAY : dayOfWeek = "ȭ����";  break;
		case Calender.WENDESDAY : dayOfWeek = "������";  break;
		case Calender.THURSDAY : dayOfWeek = "�����";  break;
		case Calender.FRIDAY : dayOfWeek = "�ݿ���";  break;
		case Calender.SATURDAY : dayOfWeek = "�����";  break;
		case Calender.SUNDAY : dayOfWeek = "�Ͽ���";  break;
		}
		System.out.print(year+"�� "+month+"�� "+day+"���� "+dayOfWeek+"�Դϴ�.");
				
		}
}
