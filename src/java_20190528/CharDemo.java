package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		char a = 'q'; //���� ǥ����
		
		char name1 = '\uC11C'; //�����ڵ� ǥ����
		char name2 = '\uAD6D';
		char name3 = '\uC8FC';
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		char b = 97;
		System.out.print(b);
		System.out.print("\n������\t����");
		System.out.print("\n������ \\ ����"); // ���ڿ� �� \�� �ν� ���ϹǷ� �տ� \ ���� -> �ν�
		System.out.print("\n������ \" ����"); // ���ڿ� �� "�� �ν� ���ϹǷ� �տ� \ ���� -> �ν�
		
		char c = '\\'; // \, ' �� ���� ���ڴ� �ν� ���ϹǷ� �տ� \ ���� -> �ν�
		char d = '\'';
		char e = '"';
		
		
	}
	
}
