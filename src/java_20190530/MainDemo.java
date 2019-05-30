package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		// 1. Customer c에서 Customer는 Reference Type, c는 reference
		// 2. new Customer()는 Object
	/*	Customer c1 = new Customer();
		c1.name = "서국주";
		c1.cphone ="010-5765-8435";
		c1.interestRate = 2.3;
		c1.register();
		
		Customer c2 = new Customer();
		c2.name = "이제훈";
		c2.cphone = "010-6478-3364";
		c1.interestRate = 2.5;
		c1.register();
		c2.register();
		
		//c3 reference를  c2 reference가 가리키는 Object를 참조하라는 의미
		Customer c3 = c2;
		c3.name = "김민규";
		c3.cphone = "010-2791-2873";
		c3.register();
		// c3를 바꿔도 c2는 똑같당
		// c1==c2 : false
		// c2==c3 : true (서로 같은 객체 참조하므로, 내용비교 아니다)
*/
		Member m= new Member();
		m.setName("서국주");
		m.setAddress("Seoul");
		m.setCphone("010-5930-2031");
		m.setZipcode("14584");
		
		System.out.println(m.getName());
		System.out.println(m.getAddress());
		System.out.println(m.getCphone());
		System.out.println(m.getZipcode());
		
	
	}
}
