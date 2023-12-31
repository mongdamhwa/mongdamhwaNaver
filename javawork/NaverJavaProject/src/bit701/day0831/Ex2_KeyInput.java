package bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class Ex2_KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date 클래스를 이용해서 현재 년도를 구해보자 (jdk1.1에서 deprecate
		되었으나 여전히 많이사용)
		Calendar를 권장한다함*/
		
		Date date=new Date(); //scan과 마찬가지로 위에 import java.util.Date; 되야함
		//getYear는 1900을 뺀값이 반환됨 그래서 1900 더해줘야함
		int curYear=date.getYear()+1900;
		System.out.println("현재 년도:"+curYear);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 태어난 년도는?");
		//문자열로 읽은후 숫자로 변환하면 다음에 문자열이 입력될 경우에도 문제가 발생하지 않는다
		int birthYear=Integer.parseInt(sc.nextLine());
		
		System.out.println("지금 사는 곳운 어디입니까?");
		String address=sc.nextLine();
		
		System.out.println("저는 "+address+"에 사는 "+birthYear+"년생 학생입니다");
		
		//나이 구하기
		int age=curYear-birthYear;
		
		System.out.println("저는 "+address+"에 사는 "+birthYear+"년생("+age+"세) 학생입니다");
		System.out.printf("저는 %s에 사는 %d년생(%d세) 학생입니다\n",address,birthYear,age);
		
		//20세 이상이면 "성인", 미만이면 "미성년자"라는 글자를 출력
		//if문으로 해도되고 조건(삼항)연산자(조건식? "참일때 값":"거짓일때값")로 해도된다, 조건식은 삼항연산자
		
		/* 이게 조건연산자 방식
		String msg=age>=20?"성인":"미성년자";
		System.out.println("당신은 "+msg); */
		
		String msg="";
		/*지역변수는 자동초기화가 안되고 쓰레기값이 들어있으므로
		값이 안들어갈 경우를 대비해서 초기값을 지정하는 것이 좋다
		지역변수는 그 구역을 빠져나가게되면 자동소멸되므로 사용이 불가능하다
		그래서 String msg="";를 밖으로 빼줬다나 뭐라나.. 뭔소린지..*/
		if(age>=20) //이게 if문으로 할경우임
		{
			//한문장만 쓸경우 {} 이렇게 구역설정하는게 생략 가능하지만 두문장 이상일 경우는 반드시 구역설정 필요 ({})
			msg="성인";
		}else {
			msg="미성년자";
		}
		System.out.println("당신은 "+msg);
	}

}
