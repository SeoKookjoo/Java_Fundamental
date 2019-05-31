package java_20190531;

public class Car {
	private String modelNumber; // 외부에서 사용 못하므로 setter, getter 만들어야 
	String color;
	protected int doorCount;
	public double price;
	
	//alt+shift+s => c
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	//alt+shift+s => o
	public Car(String modelNumber, String color, int doorCount, double price) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.doorCount = doorCount;
		this.price = price;
	}
	
	
	
}
