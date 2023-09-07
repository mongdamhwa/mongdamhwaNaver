package bit701.day0904;

public class Ex9_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="apple";
		String str2="AppLe";
		String str3="Have a Good Day";
		String str4="		Happy		";
		System.out.println(str3.length()); //str3의 총길이 : 15
		System.out.println(str2.toLowerCase());//str2을 모두 소문자로 변환
		System.out.println(str2.toUpperCase());//2를 모두 대문자로 변환
		System.out.println(str3.substring(5));//5번 인덱스부터 끝까지 출력
		System.out.println(str3.substring(7,11));//7번부터 10번가지 출력 11이면11-1까지 출력이라서 10임
		System.out.println(str3.charAt(0));//3에서 0번 문자 출력
		System.out.println(str3.charAt(7));//3에서 7번문자 출력 왜 G지?
		System.out.println(str1.indexOf('a'));//1에서 첫번째 'a'의 인덱스값
		System.out.println(str3.lastIndexOf('a'));//3에서 마지막'a'의 위치
		System.out.println(str4.length());//앞뒤 공백 포함 전체길이
		System.out.println(str4.trim().length());//앞뒤 공백 제거후길이구하기
		System.out.println(str3.startsWith("Have"));//3이 Have로 시작하면 true
		System.out.println(str3.endsWith("day"));//3이 day로 끝나면 true 근데 여기선 왜 false? 대소문자가틀려서 그렇다
		System.out.println(str1.equals(str2));//1이 2와 완벽하게 같을 경우 true
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 상관없이 철자만같으면 트루
		System.out.println(str1.compareTo(str2));//str1 과 str2의 차이 (양수값이 나오면 str1이더큰것, 음수값이면str2더 큰 경우
		System.out.println(str1.compareTo("apple")); //완전 같은경우는 0이 나옴
		
		
	}

	private static Object lastIndexOf(char c) {
		// TODO Auto-generated method stub
		return null;
	}

}
