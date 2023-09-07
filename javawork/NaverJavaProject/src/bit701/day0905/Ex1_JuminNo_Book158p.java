package bit701.day0905;

import java.util.Scanner;

public class Ex1_JuminNo_Book158p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//charAt , substring등은 0904수업 ex9 참고!
		String ssn = "9506244230123";
		char sex=ssn.charAt(6);
		switch (sex) {
		case'1':
		case'3':
			System.out.println("man");
			break;
		case'2':
		case'4':
			System.out.println("woman");
			break;
		}
		System.out.println("=".repeat(40));

		/*실행결과
		주민번호 입력
		970303-2222123  (첫번째자리 9는 0번째임 0번째부터 시작 
		substring(0,2) 면 97을 말하는거야 숫자지만 문자로 출력하는건가?)
		97년 03월 03일생
		내국인 ----> '1''2''3''4':내국인 '5''6':외국인
		여성  ------ 1,3,5 은남자 2,4,6은 여자

		q or Q일경우 종료
		"프로그램을 종료합니다"*/

		/* 내꺼
		System.out.println("주민번호입력");

		System.out.println("프로그램을 종료하려면 Q(q)를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String ssn1;
		do {
			ssn1=sc.nextLine();
			char sex1=ssn1.charAt(7);
			switch (sex1) {
			case'1':
			case'3':
				System.out.println("내국인");
				System.out.println("man");
				break;
			case'2':
			case'4':
				System.out.println("외국인");
				System.out.println("woman");
				break;
			case'5':
				System.out.println("외국인");
				System.out.println("man");
				break;
			case'6':
				System.out.println("외국인");
				System.out.println("woman");
				break;
			}
		}while(!ssn1.equalsIgnoreCase("q")); 

		System.out.println();
		System.out.println("프로그램 종료");

		 */

		//쌤풀이

		Scanner sc=new Scanner(System.in);
		String juminNo;

		while(true)
		{
			System.out.println("주민번호입력");
			juminNo=sc.nextLine();
			//q Q입력시 종료
			if(juminNo.equalsIgnoreCase("q")) {
				System.out.println("program end");
				break;
			} //while(true) 은 무한반복이라서빠져나가기위한 코드가 필요한데 그게 이Q부분임
			String yearStr=juminNo.substring(0,2);
			String monthStr=juminNo.substring(2,4);
			String dayStr=juminNo.substring(4,6);
			char gender=juminNo.charAt(7);
			System.out.println(yearStr+"년"+monthStr+"월"+dayStr+"일");

			if(gender=='1' ||gender=='2' ||gender=='3' ||gender=='4')
				System.out.println("내국인");
			else if(gender=='5' ||gender=='6')
				System.out.println("외국인");
			else
				System.out.println("8번째 값을 잘못 입력했어요");

			switch(gender)
			{
			case '1': case '3' : case '5':
				System.out.println("man");
				break;
			case '2': case '4' : case '6':
				System.out.println("woman");
				break;
			default:
				System.out.println("성별확인불가");
			}

		}

	}
}


