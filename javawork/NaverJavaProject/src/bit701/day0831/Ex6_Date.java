package bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class Ex6_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//입력한 년,월,일에 해당하는 요일 구하기
		System.out.println("년,월,일을 순서대로 입력하세요");
		/*
		(1991,9,2 이렇게 쉼표로 쓰는게 아니라
		아래처럼 하나스고 엔터 하나스고 엔터 따로따로 입력해야 제대로 나옴)
		년,월,일을 순서대로 입력하세요  
		1991
		9
		2
		요일숫자:1
		오늘은 월요일입니다

		년,월,일을 순서대로 입력하세요
		1991 12 25
		요일숫자:3
		오늘은 수요일입니다
		 */
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();

		//Date 클래스생성
		Date date=new Date(year-1900,month-1,day);

		//요일구하기
		int weekint=date.getDay();//0:일 1:월 ~ 6:토
		System.out.println("요일숫자:"+weekint);

		String week=weekint==0?"일":weekint==1?"월":weekint==2?"화":
			weekint==3?"수":weekint==4?"목":weekint==5?"금":"토";
		System.out.println("오늘은 "+week+"요일입니다");
	}

}
