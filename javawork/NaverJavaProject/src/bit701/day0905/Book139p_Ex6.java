package bit701.day0905;

public class Book139p_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) // ;j<=i이니까 i가 1이면 1개 2면 2개 이런식으로찍히지
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		
		//반대로 i=1일땐 5개, 2일땐 4개, 3개 ,2개, 1개로 줄이려면? 
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++) // ;j<=i이니까 i가 1이면 1개 2면 2개 이런식으로찍히지
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println("--------------------------------");
		//왼쪽위에서 오른쪽아래로 향하는 대각선상에는 숫자가 나오게 출력(i=j)일땐 숫자
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++) // ;j<=i이니까 i가 1이면 1개 2면 2개 이런식으로찍히지
			{
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();	
		}
	}

}
