package bit701.day0830;

public class AsciiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char, int 는 같은 타입이라고 봐도 된다 (아스키코드 내에서)
		//아스키코드에서 10진수 65는 A, B는 10진수로 66임
		char a1=65;
		int a2='B';
		System.out.println(a1);//A
		System.out.println(a2);//66
		System.out.println((int)a1);//A가아닌 그대로 int값으로 나오게 하고싶을때
		System.out.println((char)a2);//66이아닌 문자로 출력하고 싶을때
		
		System.out.printf("%d 의 아스키문자는 %c 이다\n",(int)a1,a1);
		
		char b1='C';
		int b2=68;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1+2);//묵시적 형변환에의해 char와 int를 더하면 결과는 int로 나옴 그러므로 E가 아니라 69가 나온다
		/*
		 * 묵시적 형변환(여기서 +는 실제 더하기만 의미하는게 아니라 연산(더하기,빼기 등등)을 의미)
		 * char+int=int
		 * int+int=int
		 * long+int=long
		 * double+int=double
		 * String+int=String
		 * String+double=String
		 */
		
		//print나 println은 모든타입 출력이 가능
		//이유는 타입별로 여러개를 같은 이름으로 만들어놨기 때문
		//이런 메서드를 중복함수(overloading method)라고 한다
		System.out.println((char)(b1+2));//b1+2가 69가아닌 char값으로 나오게 하고프면 (char)을 붙여서 강제 형변환해서 출력해야함
		
		System.out.println(5/2);//값은 2.5가 아닌 2가 나옴, int와 int의 연산이므로 무조건 결과도 int로 나옴
		System.out.println(5.0/2);//값은 2.5가 나옴 double+int=double 이니까!
		System.out.println((double)5/2);//double+int=double 이니까! 5를 먼저 double로 형변환한후라서 5.0을 2로 나눈것으로 출력
		System.out.println((double)(5/2));// 5/2에 괄호가 쳐있어서 먼저 계산된후에 더블로 형변화된거라서 2.0이 출력됨
		//즉, int+int=int의 결과를 double로 형변환해도 2.0이 된거지
	}

}
