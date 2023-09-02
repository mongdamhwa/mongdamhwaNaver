package bit701.day0830;

public class DataEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("apple");
		//ln안쓰면 줄넘김안됨
		System.out.println("banana");
		
		//printf:변환기호에 의한 출력,  정수:%d , 실수:%f, 문자:%c, 문자열:%s
		// \n:줄넘김, \t:다음탭위치로이동
		int age=23;
		double weight=66.7;
		char blood='A';
		String name="캐서린";
		System.out.printf("이름:%s\n\n",name);
		System.out.printf("나이:%d세\n\n",age);
		System.out.printf("몸무게:%fkg\n",weight);
		//이렇게만쓰면 소수점은 무조건 6자리까지나옴
		System.out.printf("몸무게:%5.1fkg\n",weight);
		//%5.1f라고 쓰면 전체자리수는 5, 소수점자리수는 한자리까지만 나오란듯
		System.out.printf("혈액형:%c형\n",blood);
		System.out.println("==========");
		System.out.printf("이름:%s\n혈액형:%c형\n나이:%d세\n",name,blood,age);
	}

}
