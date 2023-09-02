package bit701.day0830;

public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자 : ++(1씩 증가한다), --(1씩감소한다)
		//변수앞에 붙을경우(전치) 1순위
		//변수뒤에 붙일경우(후치) 끝순위
		//단, 단항으로 사용할경우는 앞에 오든 뒤에 오든 상관없음
		
		int a=5;
		int b=5;
		//단항으로 연산할 경우
		++a;//1증가
		System.out.println(a);
		b++;//1증가
		System.out.println(b);
		System.out.println(++a);//먼저 증가후 출력이기 때문에 값은 7이됨, 위에서 이미 값이 6이었으니까
		System.out.println(b++);//먼저 출력후 증가이기 때문에 값은 6
		System.out.println("a="+a+",b="+b);//똑같이 7이 출력됨
		
		a=b=5;
		int m=++a;
		int n=b++;
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);//6,6,6,5 가 출력됨
	}

}
