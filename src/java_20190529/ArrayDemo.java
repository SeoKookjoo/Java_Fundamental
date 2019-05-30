package java_20190529;

public class ArrayDemo {
	public static void main(String[] args) {
		//배열 생성
		int[] test = new int[4];
		int index = 0;
		
		//배열 할당
		test[index++] = 1;
		test[index++] = 2;
		test[index++] = 3;
		test[index++] = 4;

		//생성 & 할당 동시에
		int[] test1 = {1, 2, 3, 4};
		//배열 출력
/*		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);*/

/*		for (int i = 0; i < test.length; i++) {
			System.out.println(test1[i]);
		}
*/		
		int[] test2 = new int[8];
		System.arraycopy(test1, 0, test2, 0, 4);
		test2[4]=100;
		test2[5]=200;
		test2[6]=300;
		test2[7]=400;
		
		for (int i = 0; i < test2.length; i++) {
			System.out.println(test2[i]);
		}		
	}
	
}
