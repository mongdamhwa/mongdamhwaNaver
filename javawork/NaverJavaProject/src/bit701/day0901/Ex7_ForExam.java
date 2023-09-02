package bit701.day0901;

import java.util.Scanner;

public class Ex7_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		구구단을 출력할 시작단 입력
		4
		구구단을 출력할 끝단 입력
		6
		
		 4단	 5단	 6단 -단일for문으로 먼저 돌리기
		
		4X1=4   5X1=5   6X1=6  -다중for문
		4X2=8   5X2=10  6X2=12
			*/
		
		
		System.out.println("처음 출력할 구구단은?");
		int start=sc.nextInt();
		
		System.out.println("마지막 출력할 구구단은?");
		int end=sc.nextInt();
		
		//start가 end보다 클경우 두 변수의 값을 바꿔보자)
		if(start>end) {
			int temp=start; //temp는 임시변수
			start=end;
			end=temp;
		} /*만약 이런if문이 없으면, 밑에 for문에 스타트가 엔드보다
		크면 안된다고 해놔서 스타트에 더 큰값을 넣으면 출력안됨*/
		
		//제목출력
		for(int dan=start;dan<=end;dan++)
		{
			System.out.printf("%4d단\t",dan);
		}
		System.out.println("\n");
		
		for(int i=1;i<=9;i++) 
		{
			for(int dan=start;dan<=end;dan++)
			{
				System.out.printf("%5dx%d=%2d",dan,i,dan*i);
			}
			System.out.println();
		}
		
	}

}
