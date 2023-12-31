package bit701.day0904;

public class Ex3_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 난수 발생시키는 방법 두 가지
		 * 1.Math.random()
		 * 2.new Random()
		 */
		
		for(int i=0;i<5;i++)
		{
			double r=Math.random();//0.0<=r<1.0 이사이에서 랜덤으로나옴
			System.out.println(r);
		}
		System.out.println("=".repeat(30));
		for(int i=0;i<5;i++)
		{
			//int n=(int)(Math.random()*10); 
			// 이건0~9사이의 난수 발생
			int n=(int)(Math.random()*10)+1; 
			//얘는1~10사이의 난수 발생
			System.out.println(n);
		}
		System.out.println("=".repeat(30));
		for(int i=0;i<5;i++)
		{
			int n=(int)(Math.random()*26)+65; 
			//65~90사이의 난수 발생 (대문자 아스키코드)
			System.out.println((char)n);
		}
		System.out.println("=".repeat(30));
		for(int i=0;i<5;i++)
		{
			int n=(int)(Math.random()*26)+97; 
			//97~122사이의 난수 발생 (소문자 아스키코드)
			System.out.println((char)n);
		}
	}

}
