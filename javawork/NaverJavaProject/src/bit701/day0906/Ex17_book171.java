package bit701.day0906;

public class Ex17_book171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1(); //static method 호출
		//Ex17_book171.test1(); 
		//위 두개 서로 같은거 호출함
		//자기 자신안에 있는 static method는 클래스명 생략가능
		//그래서 이렇게 다 안쓰고 위에 처럼 test1();만 써도됨
		
		//170~171p 읽어보기 무조건!!
		
		int[] scores;
		scores=new int[] {83,90,87};

		int sum1=0;
		for(int i=0;i<scores.length;i++)
		{
			sum1+=scores[i];
		}
		System.out.println("총합:"+sum1);
		
		printItem(scores);
		
		System.out.println("=".repeat(30));
		printItem(new int[] {45,67,78,89,99,100});
		
	}
	/*
		public static void test1()
		{
			System.out.println("test1 메서드 호출");
		}
		*/
	public static void printItem(int []scores)
	{
		//매개변수가 참조하는 배열의 항목을 출력
		for(int i=0;i<scores.length;i++)
		{
			System.out.println("score["+i+"]:"+scores[i]); //main에 있는 scores랑 다른애야 같은 변수지만? 이름은 다르게 써도된데 여기껀;;
		}
	}
	
}
