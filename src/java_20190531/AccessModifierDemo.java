package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifierDemo extends Cat {
	public static void main(String[] args) {
		Car c = new Car();
		//*private이므로 Class내에서만 접근가능
		//c.modelNumber ="68오4472";
		//*default이므로 같은  package내에서 접근가능
		c.color = "White";
		//*protected이므로 상속받은 서로 다른 package에서 접근가능
		c.doorCount = 5;
		//*public이므로 서로 다른 package내에서도 접근가능
		c.price = 10000000;

		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		
		Cat cat = new Cat();
		cat.nickName = "tomato";
		System.out.println(cat.nickName);
		
		//상속 받아서 protected, public 나타낼 수 있음
		AccessModifierDemo a = new AccessModifierDemo();
		a.age = 10;
		a.nickName = "먼지";
		
		
		
	
	}
}