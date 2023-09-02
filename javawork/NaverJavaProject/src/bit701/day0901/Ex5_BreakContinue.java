package bit701.day0901;

public class Ex5_BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=10;a++)
		{
			System.out.printf("%3d",a);
			if(a==5)
				break;//5까지 출력후 반목문을 빠져나간다
			
			/*
			만약에 위랑 반대로 if문을 위에쓰면 5출력전 반복문 빠져나감
			if(a==5)
				break;
			System.out.printf("%3d",a); 
			 */
		}
		System.out.println();
		System.out.println("-".repeat(30));
		
		
		for(int a=1;a<=10;a++)
		{
			if(a%2==0) //짝수일경우 출력않고 다음숫자로 가고자 할 경우
				continue;//a++ 증감식으로 이동
			System.out.printf("%3d",a);
		}
		System.out.println();
		System.out.println("-".repeat(30));
		
		//다중 for문의 경우 한거번에 2개의 반복문을 빠져나가고자 할 경우
		Exit:
		for(int i=1;i<=3;i++)
		{
			System.out.println("i="+i);
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%3d",j);
				if(j==3)
					break;
			}
			System.out.println(); 
		}
		System.out.println("-".repeat(30));
		
		
		
		Exit:
			for(int i=1;i<=3;i++)
			{
				System.out.println("i="+i);
				for(int j=1;j<=5;j++)
				{
					System.out.printf("%3d",j);
					if(j==3)
						break Exit;//위랑 다르게 j가 3되면 두개의 반복문을 모두빠져나감
				}
				System.out.println();
			}
			System.out.println("-".repeat(30));
	}

}
