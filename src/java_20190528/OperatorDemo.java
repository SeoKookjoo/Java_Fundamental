package java_20190528;

public class OperatorDemo {
	public static void main(String[] args){
		/* �޷� �����
		 * 1. 1�� 1�� 1�� ������
		 * 2. ������ 4�� ���� �߻��ϰ� �� �߿� 100�� ����� �����ϰ� 400�� ����� �����Ѵ�
		 * 3. 2019�� 5�� 28���� ������ ���Ϸ���
		 * 	2018����� �� �ϼ� ���ϱ�
		 * 	4������ �� �ϼ� ���ϱ�
		 * 	28�� ���ϸ� �� �ϼ��� ����
		 * 4. �� �ϼ��� 7�� ���� �������� 1�̸� ������, 2�̸� ȭ���� ... 6�̸� �����, 0�̸� �Ͽ���
		 */
		
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;
		
		totalCnt = preYear * 365 + (preYear/4) - (preYear/100) + (preYear/400);
		totalCnt += (31+28+31+30);
		totalCnt += date;

		System.out.print(totalCnt%7);
		
		
		int a =10;
		System.out.println(a++);
		System.out.println(++a);
		
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10 + 1;
		
		
	}
}
