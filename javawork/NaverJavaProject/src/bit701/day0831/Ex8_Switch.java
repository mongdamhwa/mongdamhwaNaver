package bit701.day0831;

import java.util.Scanner;

/*스위치문은 jdk8 이전까지는 정수, 문자만 가능했으나
그 이후 문자열도 가능해짐*/

public class Ex8_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//숫자를 입력받아 1:one 2:two 3:three 그 이외 : other number
		/*
		
		System.out.println("숫자입력");
		int num=sc.nextInt();
		//switch는 num값에 따라서 해당case실행
		//단 break가 없을경우끝까지 실행됨
		//브레이크문 쓸때 일부러 다 실행되게 하려고 브레이크 안쓰는 경우도 있음
		
		switch (num) {
		case 1:
			System.out.println("one!");
			break;//switch 문을 빠져나간다
		case 2:
			System.out.println("two!");
			break;//switch 문을 빠져나간다
		case 3:
			System.out.println("three!");
			break;//switch 문을 빠져나간다
		default:
			System.out.println("other number!");
		}
		*/
		/*만약 브레이크 다 없는 상태면 
		아래처럼 숫자 3을 입력하면 쓰리만 나오는게 아니라 아더 넘버도 같이나옴
		
		숫자입력
		3
		three!
		other number!*/
		
		
		System.out.println("영문 색상명을 입력하세요");
		String color=sc.nextLine();
		
		switch(color)
		{
		case "red": //이다음에 break가 없으므로 소문자든 대문자든 다음 case문이 실행될수 있음
		case "RED":
			System.out.println(color+":빨간색");
			break;
		case "green":
		case "GREEN":
			System.out.println(color+":초록색");
			break;
		case "pink":
		case "PINK":
			System.out.println(color+":분홍색");
			break;
		default:
			System.out.println(color+":그 이외의 색");
		}
		
	}

}
