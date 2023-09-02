package bit701.day0830;

public class DataEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("내 이름은 "+args[0]+" 입니다");
		//이렇게만 하면 오류남 , 위에 run configuration에서 Ex2파일에서 아규먼트에 추가해줘야함
		//왜냐면 args[0]이라 0번째에 있는걸 출력해줘야하는데 아무것도 없는상태이기 때문임.
		//난 한충희 이름 추가한 상태
		System.out.println("우리집은 "+args[1]+" 입니다");
		//마찬가지로 아규먼트 한충희 옆에 도봉구 추가한 상태
		System.out.println("내 혈액형은 "+args[2]+"형 입니다");
		System.out.println();//아무것도 없이 그냥 이것만 쓰면 한칸띄울수 있음
		System.out.println("실수형 데이터 타입");
		float f1=1234.567891234f;//4바이트 float 값을 지정하려면 f추가
		double f2=1234.56781234;
		System.out.println(f1);//8자리까지만 정확히 출력됨 소주점은 반올림되서 5678이아닌 5679로 출력됐네
		System.out.println(f2);//15자리까지 정확히 출력됨, 소수점은 플롯보단 더블쓰는게 더 낫네
		
		//char타입은 2바이트라 한글 한글자도 저장이 가능함
		char ch1='A';
		char ch2='가';
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
