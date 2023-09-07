package bit701.day0905;

import java.util.Scanner;

public class Book139p_Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money=0, total=0, num;
		Exit:while(true)
		{
			System.out.println("=".repeat(40));
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("=".repeat(40));
			System.out.print("선택>");

			num =sc.nextInt();
			switch(num)
			{
			case 1: 
				System.out.println("예금액:");
				money=sc.nextInt();
				total += money;
				break;

			case 2: 
				System.out.println("출금액:");
				money=sc.nextInt();
				total -= money;
				break;

			case 3: 
				System.out.println("잔금:"+money);
				break;
			case 4:
				break Exit; //여기서 끝나서 exit으로 나가면 System.out.println("종료"); 로 가는거지
			default: //선생님이 추가로 요청한 조건
				System.out.println("1~4로 입력하세요");
			}

		}
		System.out.println("종료");
	}

}
