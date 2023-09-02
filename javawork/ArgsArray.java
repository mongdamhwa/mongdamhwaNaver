public class ArgsArray{
	public static void main(String []args)
	{
		//args로 두개의 숫자를 읽어서 출력해보자
		String str1=args[0];
		String str2=args[1];
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		System.out.println("두 수의 합="+(str1+str2));
		/*이렇게만 하면 str이 그냥 스티링이기 때문에 
		java ArgsArray 10 20 했을때 두수의합이 1020으로 나옴
		30 으로 나오게하기위해선 정수로 변환해야함*/

		//String을 기본형 int로 변환하는 방법
		//Integer라는 Wrapper class를 이용해서 변환해보자
		int su1=Integer.parseInt(str1); //문자열을 정수로 바꿔줌
		//parseInt는 Integer라는 wrapper클래스가 가진 메서드
		int su2=Integer.parseInt(str2);
		System.out.println("두 수의 합="+(su1+su2));
	}
}