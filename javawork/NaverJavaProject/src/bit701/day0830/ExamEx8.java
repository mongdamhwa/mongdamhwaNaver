package bit701.day0830;

public class ExamEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//money 변수에 arg[0]값을 대입후 (급여:백만단위:5674321)
		/*
		  출력
		  money:5674321원
		  만원짜리 567장
		  천원짜리 4장
		  백원짜리 3개
		  십원짜리 2개
		  일원짜리 1개
		  
		  산술연산자 사용해서 출력해보세요
		 */
		
		/*
		내풀이
		String money=args[0];
		int su1=Integer.parseInt(money);
		System.out.println("money:"+money+"원");
		System.out.println("만원짜리"+(su1/10000)+"장");
		System.out.println("천원짜리"+((su1-((su1/10000)*10000))/1000)+"장");
		System.out.println("백원짜리"+(su1-5674000)/100+"개");
		System.out.println("십원짜리"+(su1-5674300)/10+"개");
		System.out.println("일원짜리"+(su1-5674320)/1+"개");
		
		System.out.println("만원짜리"+su1/10000+"장");
		System.out.println("천원짜리"+(su1%10000)/1000+"장");
		System.out.println("만원짜리"+((su1%10000)%1000)/100+"장");
		System.out.println("만원짜리"+(((su1%10000)%1000)%100)/10+"장");
		System.out.println("만원짜리"+((((su1%10000)%1000)%100)%10)/1+"장");
		*/
		
		
		//이밑은 선생님 풀이
		//파라미터에서 월급여를 읽어서(문자열) 정수타입으로 변환한다
		int money=Integer.parseInt(args[0]); 
		/*혹여나 숫자가 21억 이렇게 큰단위면
		int가 아닌 long타입써야함 그리고 숫자뒤에는 l붙여줘야함. 
		또 Integer.parseInt(String s) 타입일때 안에 들어갈 스트링 형태는 
		무조건 아라비아 숫자여야함. 숫자사이에 공백이나 점같은거 찍혀있어도안됨
		만약 위에 args[0]에 들어갈거로 5674321이 아닌 5,674,321을 적어놨다면 오류남*/
		System.out.println("월 급여:"+money);
		System.out.println("만원짜리"+money/10000+"장");
		//어차피 우선순위는 곱하기가 먼저라서 괄호같은건 안쳐도됨
		System.out.println("천원짜리"+(money%10000)/1000+"장");
		//%가 먼저 계산되야하니 괄호쳐야지
		System.out.println("백원짜리"+(money%1000)/100+"개");
		//굳이 나처럼 저렇게 할필요없지 걍 1000으로 나눈 나머지를 100으로 나누면되네;
		System.out.println("백원짜리"+(money%100)/10+"개");
		System.out.println("백원짜리"+(money%10)/1+"개");
	}

}
