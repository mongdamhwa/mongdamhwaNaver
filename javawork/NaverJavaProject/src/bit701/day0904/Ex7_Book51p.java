package bit701.day0904;

public class Ex7_Book51p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//json 데이터{"키":"값"}
		String jdata="{\"name\":\"이진\"}";
		//json데이터쓸땐 원래 이렇게 복잡하게써야햇음 불편
		//따옴표다음 따옴표가 인식이 안되서 역슬래시를 쓰는것
		System.out.println(jdata);
		
		//jdk13에서 추가된 텍스트 블록 문법 """ (따옴표3개)이용
		
		String jdata2=
				"""
				{"name":"캔드","address":"역삼동"}
				""";
		System.out.println(jdata2);
		
		//옛날방식
		String name="마이클잭슨";
		int age=32;
		String jdata3="{\"name\":"+name+"\",\"age\":"+age+"}";
		System.out.println(jdata3);
		
		//텍스트 블록 문법에 변수값을 넣는 방법
		String jdata4="""
				{"name":"%s","age":%d}
				""".formatted(name,age);
		System.out.println(jdata4);
		//문자열일땐 "name":"이름" 따옴표 써야하고
		//숫자일땐 따옴표 안서도 무관 "age":13
		
		
		//그리고 전 방식은 한깐 띠려면 \n써야하는데
		String str1="red\nblue\ngreen";
		System.out.println(str1);
		
		//블록 문법에선 \안써도 쓴 그대로 출력됨 
		String str2="""
				red
				blue
				green
				pink
				""";
		System.out.println(str2);
				
		
	}

}
