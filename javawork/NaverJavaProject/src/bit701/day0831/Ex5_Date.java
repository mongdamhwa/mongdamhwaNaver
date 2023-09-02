package bit701.day0831;

import java.util.Calendar;
import java.util.Date;

public class Ex5_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 시간이나 날짜 출력하는 방법
		System.out.println("Date 클래스를 이용해서 시간, 날짜 구하기");
		Date date=new Date();
		int year=date.getYear()+1900;
		int month=date.getMonth()+1;//0~11까지기 때문에 1더하기 필요
		int day=date.getDate();
		
		int hh=date.getHours();
		int mm=date.getMinutes();
		int ss=date.getSeconds();
		
		System.out.printf("현재년도 : %d-%2d-%2d\n",year,month,day);
		System.out.printf("현재년도 : %d-%02d-%02d\n",year,month,day);
		/* 이렇게 쓰면 두자리가 안되는 월이나 일일때 자동으로 앞에 0붙여주네*/
		System.out.printf("현재시간 : %02d-%02d-%02d\n",hh,mm,ss);
		
		System.out.println("Calendar 클래스를 이용해서 시간, 날짜 구하기");
		//Calendar cal=new Calendar();
		//Calendar 는 위에 처럼 new 붙이면 오류남, 생성자가 public이 아니기때문.
		//new 쓰면 안되는 게 몇  개 있음 public이 아닌 protected 라서?
		//이런 public이 아닌 경우는 항상 getInstance 써서 반환함
		Calendar cal=Calendar.getInstance();
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH)+1;
		day=cal.get(Calendar.DATE);
		
		System.out.printf("현재년도 : %d-%02d-%02d\n",year,month,day);
		
		//요일구하기
		int weekint=date.getDay();//0:일 1:월 ~ 6:토
		System.out.println("요일숫자:"+weekint);
		
		String week=weekint==0?"일":weekint==1?"월":weekint==2?"화":
			weekint==3?"수":weekint==4?"목":weekint==5?"금":"토";
		System.out.println("오늘은 "+week+"요일입니다");
		
		
	}

}
