package java_20190528;

public class ForDemo {
	public static void main(String[] args){
		
/*		int sum = 0;
		int i = Integer.parseInt(args[0]);
		for (int j=1;j<=i;j++){
			if(j% 2 == 0){
			sum = sum + j;
			}
		}
		System.out.println("1부터 "+i+"까지 짝수의 합은 "+sum);
		
		
		for(int a=2; a<=9; a++){
			for(int b=1; b<=9; b++){
				int c=a*b;
				System.out.println(a+" * "+b+" = "+c);
			}
		}*/
		
		
		//1부터 100까지 숫자 중 소수 구하기
		int x, y, count;
		 for(x=2;x<=100;x++){
			 count = 0;
			 for(y=2;y<x;y++){
				 if(x%y==0)
					 count+=1;
			 }
			 if(count==0)
			 System.out.println(x+"는 소수입니다.");
					 
		 }

	}
		 
		
}

	
