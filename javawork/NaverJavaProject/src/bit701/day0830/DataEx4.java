package bit701.day0830;

public class DataEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//16진수는 앞에 0x붙지
		//웹에서 색상을 보통 16진수로 표현하지 흰색은 ffffff 이런식으로
		int a1=0xa3;//10진수로얼마? 10*16+3 이니까 163
		//16진수dptj 10=a 11=b 12=c 이렇게 되기때문
		System.out.println(a1);
		int a2=0xf4;//15*16+4
		System.out.println(a2);
		int a3=0xa56;//10*16^2 +5*16 +6 =2646
		System.out.println(a3);
		
		//8진수(16진수는 앞에 0x붙이는것처럼 8진수는 앞에 0붙이면 8진수로인식
		int a4=045;//4*8+5 =37
		System.out.println(a4);
	}

}
