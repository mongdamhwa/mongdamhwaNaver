package bit701.day0830;

public class OperEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교연산자와 논리연산자, 결과값은 무조건 참(true), 거짓(false)
		int kor=100, eng=90, mat=100;
		System.out.println(kor>=80);//true
		System.out.println(kor>=80 || kor!=mat);//true, 뒤의 수식은 비교하지도 않음, 왜냐면 앞에가 이미 참이기때문
		System.out.println(kor<80 || kor!=mat);//false
		System.out.println(kor>=80 && kor!=mat);//false
		System.out.println(kor<80 && kor!=mat);//false, 앞이 이미false라 뒤 연산은 보지도 않음
		System.out.println(!(kor==mat));//f
		System.out.println(kor>=95 && eng>=95 && mat>=95);//false
		System.out.println(kor>=95 && eng>=95 || mat>=95);//true
		System.out.println(kor>=95 || eng>=95 && mat>=95);//true
		
		int year=2023;
		//위 년도가 윤년인지 아닌지 알아보자
		System.out.println(year%4==0 && year%100!=0 || year%400==0);
	}

}
