package bit701.day0904;

import java.util.Scanner;

public class Ex6_RandomWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정답시 종료되지않고 다시 와일문이동해서문제 또 나오게 하는법
		Scanner sc=new Scanner(System.in);
		int rnd, count, num;
		
		Exit:
		while(true)
		{
			rnd=(int)(Math.random()*100)+1;
			count=0;
			
			while(true)
			{
				System.out.println(++count+":");
				//num=sc.nextInt(); 
				//이렇게하면 정답맞춘후에 다시와일문 안나오고
				//그냥 종료됨 왜냐면 숫자 입력후 발생하는 엔터값을 먼저 읽어서 그렇게 됨
				//그래서 8/31 첫예제에서 배운것처럼 
				//문자열 있을땐 숫자 읽을경우도 그냥 밑에 처럼 넥스트라인으로 쓰는게 나음
				num=Integer.parseInt(sc.nextLine());
				if(num>rnd)
					System.out.println("\t"+num+"보다 작습니다");
				else if(num<rnd)
					System.out.println("\t"+num+"보다 큽니다");
				else {
					System.out.println("\t**정답입니다("+rnd+")");
					//계속할지 묻는다
					System.out.println("계속하려면 y를 입력해주세요, y가 아닌경우 종료!");
					String ans=sc.nextLine();
					if(ans.equalsIgnoreCase("y"))
					{
						System.out.println("새로운 난수를 발생하겠습니다");
						continue Exit;//바깥쪽while문의 조건식으로 이동한다
					}else {
						break Exit;//두개의 while문을 모두 빠져나간다
					}
				}
				
			}
		}
		System.out.println("--program종료--");
	}

}
