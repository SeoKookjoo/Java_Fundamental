package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		// 1. Customer c���� Customer�� Reference Type, c�� reference
		// 2. new Customer()�� Object
	/*	Customer c1 = new Customer();
		c1.name = "������";
		c1.cphone ="010-5765-8435";
		c1.interestRate = 2.3;
		c1.register();
		
		Customer c2 = new Customer();
		c2.name = "������";
		c2.cphone = "010-6478-3364";
		c1.interestRate = 2.5;
		c1.register();
		c2.register();
		
		//c3 reference��  c2 reference�� ����Ű�� Object�� �����϶�� �ǹ�
		Customer c3 = c2;
		c3.name = "��α�";
		c3.cphone = "010-2791-2873";
		c3.register();
		// c3�� �ٲ㵵 c2�� �Ȱ���
		// c1==c2 : false
		// c2==c3 : true (���� ���� ��ü �����ϹǷ�, ����� �ƴϴ�)
*/
		Member m= new Member();
		m.setName("������");
		m.setAddress("Seoul");
		m.setCphone("010-5930-2031");
		m.setZipcode("14584");
		
		System.out.println(m.getName());
		System.out.println(m.getAddress());
		System.out.println(m.getCphone());
		System.out.println(m.getZipcode());
		
	
	}
}
