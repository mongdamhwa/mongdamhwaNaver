package bit701.day0831;

import java.util.Scanner;

public class Ex1_KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*static 변수나 메서드는 new로 객체를 생성하지않고 호출한다
		  대표적으로 Math 클래스의 모든 메서드는 static이다*/
		System.out.println("3의 5승" + Math.pow(3, 5));
		/* pow(double a, double b)은 double로 출력됨. 혹여나 소수점 붙는게 싫다면
		   Math앞에 Int붙이면됨*/
		System.out.println("5,7중 더 큰값은?" + Math.max(5, 7));
		/*여기서 pow랑 다르게 
		 * max얘기하면서 무슨 오버로딩 메서드 설명했는데 물어보기*/

		Scanner sc = new Scanner(System.in);
		/*scan 정도 까지 쓰고 ctrl+space눌러서 java.util.Scanner; 실행해서
		위에 import java.util.Scanner; 선언해줘야 제대로 작동*/
		//new로 객체를 생성, 이 변수를 인스턴스 변수라고 한다 (위에선 sc, 변수명은 임의로 줄수있음)
		/*
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();// 한줄 전체를 읽어온다 공백이 있어도 읽어옴
		System.out.println("내 이름은 " + name + " 입니다");
		
		System.out.println("당신의 나이를 입력하세요");
		int age = sc.nextInt();
		밑에 콘솔창에 숫자 아라비아로 쓰면 값 출력됨, 한글로 쓰면 안됨
		System.out.println("응! 나는 " + age + " 세야!");
		
		*/
		
		/*근데 위에 순서(문자열(이름)먼저 입력후 숫자(나이))대로 안하고 반대로,
		  숫자입력후 문자열을 입력받는경우 입력안되는 현상이 발생함
		  숫자 입력후 발생하는 엔터값이 버퍼에 저장되는데 문자열 입력시
		  이 버퍼를 먼저 읽고 없을경우 키보드로 읽는다*/
		
		/*
		System.out.println("당신의 나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("응! 나는 " + age + " 세야!");
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("내 이름은 " + name + " 입니다");
		
		그래서 위 예시의 경우에는 나이 30을 입력하면 아래처럼 출력됨
		당신의 나이를 입력하세요
		30
		응! 나는 30 세야!
		이름을 입력하세요
		내 이름은  입니다
		*/
		
		
		//고치는 방법은 두개임
		// 방법1 버퍼의 엔터문자를 먼저 읽어서 없애는 방법
		// 아래 처럼 sc.nextLine(); 이걸 중간에 끼워넣네?
		// 방법2는 숫자를 읽을경우도 무조건 nextLine으로 문자열로 입력후 변환해서 사용한다
		
		System.out.println("당신의 나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("응! 나는 " + age + " 세야!");
		
		sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("내 이름은 " + name + " 입니다");
		
	}

}
