package bit701.day0906;

public class Ex5_ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최대값, 최소값구하기
		int []data;
		data=new int[] {5,-100,67,89,45,-9,123,58,110,200};
		int max,min;
		System.out.println(data.length);
		
		//최대값 최소값구하기
		max=data[0];//일단 첫번째 데이타를 최대값에 저장한다
		//2번째 데이타부터 끝까지 비교해서 더큰값이 나올때마다 max값을 변경한다
		min=data[0];
		for(int i=1;i<data.length;i++) //0번째 인덱스가아닌 두번째부터 비교하면 되니까 i=1부터 해도되지
		{
			if(max<data[i])
				max=data[i];
			
			if(min>data[i])
				min=data[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
