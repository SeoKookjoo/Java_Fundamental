package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifierDemo extends Cat {
	public static void main(String[] args) {
		Car c = new Car();
		//*private�̹Ƿ� Class�������� ���ٰ���
		//c.modelNumber ="68��4472";
		//*default�̹Ƿ� ����  package������ ���ٰ���
		c.color = "White";
		//*protected�̹Ƿ� ��ӹ��� ���� �ٸ� package���� ���ٰ���
		c.doorCount = 5;
		//*public�̹Ƿ� ���� �ٸ� package�������� ���ٰ���
		c.price = 10000000;

		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		
		Cat cat = new Cat();
		cat.nickName = "tomato";
		System.out.println(cat.nickName);
		
		//��� �޾Ƽ� protected, public ��Ÿ�� �� ����
		AccessModifierDemo a = new AccessModifierDemo();
		a.age = 10;
		a.nickName = "����";
		
		
		
	
	}
}