package bit701.day0831;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		상품명과 수량, 단가를 각각 입력 받은후 총 금액을 출력하기
		그리고 수량이 5개 이상인 경우 10프로 할인된 최종 금액도 출력하기
		
		예)
		상품명: 딸기
		수량: 6
		단가: 1000
		
		총금액: 6000원
		5개 이상 10프로 할인된 금액: 5400원
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품명을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("수량을 입력하세요");
		int number = sc.nextInt();
		
		System.out.println("단가를 입력하세요");
		int price = sc.nextInt();
		
		System.out.println("상품명 : "+name);
		System.out.println("수량 : "+number);
		System.out.println("단가 : "+price+"\n");
		
		
		NumberFormat numberFormat1=NumberFormat.getInstance();
		if(number>=5) {
		System.out.println("총금액 : "+price*number);
		System.out.println("5개 이상 10프로 할인된 금액 : "+((price*number)-(price*number)/10));	
		
		System.out.println("총금액 : "+numberFormat1.format(price*number));
		System.out.println("5개 이상 10프로 할인된 금액 : "+numberFormat1.format((price*number)-(price*number)/10));
		//이건 쉼표 붙는 버전
		}
		else {
			System.out.println("총금액 : "+numberFormat1.format(price*number));
		}
	}

}
