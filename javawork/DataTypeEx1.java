public class DataTypeEx1{
	public static void main(String []args)
	{
		//이 라인은 비실행문입니다
		/*
			2023.08.30
			데이터 타입 예제
		*/
		//byte는 1byte 크기의 정수형 타입입니다
		//크기는 -128~127의 수자만 저장이 가능합니다
		byte a=127;
		//밑에"a=" 라고 한건 문자로 나오게하려고한것
		System.out.println("a="+a);

		/*byte b=200;//오류발생
		System.out.println("b="+b);
		이상태로 출력했을땐 200이 byte범위를 넘어서 
		오류발생이라고 결과나옴*/

		byte b=(byte)200;//괄호byte를통해 강제형변환
		System.out.println("b="+b);//강제형변환했을경우 값손실 발생
		//값이 출력은 되는데 대신 값손실 발생되서 b=-56이 나옴
		//-56이 나온 이유 설명해줌 1의보수? 란 개념통해서 알려줌 찾아보기
		//이진법 알아야할듯

		//실행시 인자로 넘어오는 문자열을 확인해보자
		System.out.println(args[0]);//배열의 첫문자열출력
		//이렇게 하고 컴파일한후 그냥 java DataTypeEx1 로 출력하면 오류남
		//args[0]이라 했으니 적어도 0번째에 문자열이 하나와야함
		//예를들어 java DataTypeEx1 apple 로 적으면 apple이 출력됨
	}
}