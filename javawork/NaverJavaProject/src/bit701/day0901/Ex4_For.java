package bit701.day0901;

public class Ex4_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<0;a++) {/*초기값이 1인데 조건이 0보다 
		작을경우에만 반복하므로 한번도 실행안함*/
			System.out.println("a="+a);
		}
		System.out.println("=".repeat(30)); 
		//문자함수인데 "="을 30번 반복한단의미
		
		for(int a=1;a<=10;a++) //위에서 a썼는데 또쓸수있는 이유 알려줬는데 못들음
			System.out.printf("%4d",a);
		System.out.println();
		System.out.println("=".repeat(30)); 
		//for문에서 for()다음 바로; 쓰면 안됨 그대로 종료되서 별 결과없이 반복된다나?
		
		for(int a=1;a<=20;a+=3)//1,4,7,10....
			System.out.printf("%3d",a);
		System.out.println();
		System.out.println("=".repeat(30));
		
		for(int a=10;a>=1;a--)
			System.out.printf("%3d",a);
		System.out.println();
		System.out.println("=".repeat(30));
		
		//다중 for문
		for(int i=1;i<=3;i++)
		{
			System.out.println("i="+i);
			
			for(int j=1;j<=5;j++) {
				System.out.printf("%3d",j);
			}
			System.out.println();//줄넘김
		}
		System.out.println("=".repeat(30));
		
	}

}
