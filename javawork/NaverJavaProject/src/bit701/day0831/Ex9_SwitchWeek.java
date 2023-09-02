package bit701.day0831;

import java.util.Scanner;

public class Ex9_SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*연도와 월을 입력하면 몇일까지 있는지 출력하기
		일단 해당 연도가 윤년인지 아닌지부터 판단하기*/
		System.out.println("연도 4자리 숫자 입력");
		int year=sc.nextInt();
		System.out.println("월 (1~12) 입력");
		int month=sc.nextInt();
		//잘못 월을 입력한 경우 종료한다
		if(month<1 || month>12)
		{
			System.out.println("월을 잘못 입력했습니다");
			return;
		}
		
		System.out.printf("입력한 년도와 월 : %d년 %d월\n\n",year,month);
		int days=0;
		boolean b=year%4==0 && year%100!=0 || year%400==0;
		/*if(b==true) System.out.println("윤년");*/
		if(b) System.out.println("윤년");//바로위에 쓴거랑 완전 같은뜻
		/*조건에서 true는 생략가능 b==true는 그냥 b라고 써도 무관
		b==false 는 !b라고만 써도 됨*/
		else System.out.println("평년");
		System.out.println();
		
		switch(month)
		{
		case 2:
			days=b?29:28; //b가 true면 윤년이므로 29일 아닐경우 평년 28일을 days에 저장
			break;
		case 4:
		case 6:
		case 9:	
		case 11:
			days=30;
			break;
		default:
			days=31;
		}
		
		System.out.printf("%d년 %d월은 %d일까지 있습니다",year,month,days);
	}

}
