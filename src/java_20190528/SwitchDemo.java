package java_20190528;

public class SwitchDemo {
	public static void main(String[] args){
		
		int month = Integer.parseInt(args[0]);
/*		switch(month){
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month+"���� �ܿ��Դϴ�.");break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month+"���� ���Դϴ�.");break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month+"���� �����Դϴ�.");break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month+"���� �����Դϴ�.");break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	
		}*/
		
		String season = null;
		switch(month){
		case 12 :
		case 1 :
		case 2 :
			season = "�ܿ�"; break;
		case 3 :
		case 4 :
		case 5 :
			season = "��"; break;
		case 6 :
		case 7 :
		case 8 :
			season = "����"; break;
		case 9 :
		case 10 :
		case 11 :
			season = "����"; break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");	
		}
		System.out.println(month+"���� "+season+"�Դϴ�.");
	
		
	}
}
