package bit701.day0830;

public class OperEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자
		int su1=7, su2=4;
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2);//소수점은 안나오고 1로 나오지 정확히 나오려면?
		System.out.println((double)su1/su2);//앞이든 뒤든 하나에 double을 붙여주면 정확히 1.75출력
		System.out.println(su1%su2);//4로 나눈 나머지니까 3이나옴
	}

}
