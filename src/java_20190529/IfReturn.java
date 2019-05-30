package java_20190529;

public class IfReturn {
	public static void main(String[] args) {
		System.out.println("===return¹®===");
		for (int i = 10; i >= 1; i--) {
			if (i % 6 == 0) {
				return;
			}
			System.out.println(i);
		}

	}
}
