package bit701.day0906;

public class Ex1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//교재 16p부터
		//배열 :연속된 형태로 데이터가 저장되는 형태
		//배열에는 같은 타입의 데이터만 저장 가능
		//일괄적으로 처리하기위해서 배열 사용
		///자바에서 하나의 배열은 하나의 객체로 인식된다
		//타입상관없이 하나의 객체로 인식
		
		//배열선언방법
		int []arr1 = new int[5]; //5개의 정수타입을 저장할 공간이확보 , 0으로 자동 초기화
		//혹시나 저장공간을 얼마나 확보해야할지 가늠이 안된다면 나중에 배우는데 컬렉션이란걸 쓰면됨
		System.out.println("arr1의 할당갯수:"+arr1.length); //5
		
		//배열의 특정번지에 값을 넣는 방법
		arr1[1]=10;
		arr1[4]=50;
		
		//출력1
		for(int i=0;i<arr1.length;i++)//;i<=arr1.length <=로 잘못쓰면 번지가 4번까지 밖에 없는데 5도 출력하려하니 오류남
		{
			System.out.println(arr1[i]);
		}
		
		//출력2
		for(int n:arr1) //arr1의 갯수만큼 자동으로 반복이 되면서 하나하나의 값을 n으로 보냄
		{
			System.out.println(n);
		}
		
	}

}
