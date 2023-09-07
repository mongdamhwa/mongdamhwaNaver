package bit701.day0904;

public class Ex1_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		반복문에는for,while,do~while 3가지가 있다
//		for문은 주로 반복횟구가 정해져 있는 경우에 많이 사용
//		while이나 do~while은 반복 횟수가 정해져있지 않은 경우에 많이 사용
//		while과 do~while의 차이는 조건을 먼저주느냐, 나중에 주느냐(선조건/후조건)차이
		
		int a=65;//대문자 A의 아스키코드값
		while(a<=90)//조건이 참인동안 실행, 즉 91이 되면 빠져나감
		{
//			System.out.print((char)a);
//			a++;
			
			//위의 코드를 한줄로 줄이면 아래처럼 써도됨 왜지??
			System.out.print((char)a++);
		}
		System.out.println();
		System.out.println("빠져나온후에 a값"+a);
		
		/*이렇게만 쓰면 무한루프 돈다고함 이유는??
		왜냐면 a++연산이 없으니 a가 계속 65에 머무니까 계속 90이하인 상태고
		거기에 System.out.print((char)a); 이렇게되면
		계속 AAAAAAAA...무한으로 나오지, 못빠져나가지
		
		int a=65;//대문자 A의 아스키코드값
		
		while(a<=90)//조건이 참인동안 실행, 즉 91이 되면 빠져나감
		{
		 System.out.print((char)a);
		}
		System.out.println();
		System.out.println("빠져나온후에 a값"+a);*/
		 
		
		
		
		a=65;
		while(true)
		{
			System.out.print((char)a++);
			if(a>90) {
				break;
			}
			//a>=91로 써도되지
		}
		System.out.println();
		a=65;
		do {
			System.out.print((char)a++);
		}while(a<=90); //조건뒤에 반드시 ; 추가
		
		
		/*
		int n=10;
		while(n<10) //조건이 거짓이면 한번도 반복안함
		{
			System.out.println(n--);
		}
		*/
		
		/*위랑 다르게 아래처럼 do~while로 하면 거짓이라도 무조건 일단 한번은 실행되서
		만약 밑에처럼만쓰면 무한 루프돈다 왜??
		int n=10; 
		do {
			System.out.println(n--);
		}while(n<10);
		*/
	
	
		//do~while로 할 시, 아래처럼해야 정상작동
		int n=10; 
		do {
			System.out.println(n--);
			if(n==0)
				break;
		}while(n<10);
	}

}
