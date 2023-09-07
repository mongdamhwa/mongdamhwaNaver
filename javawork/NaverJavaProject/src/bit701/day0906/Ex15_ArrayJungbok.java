package bit701.day0906;

import java.util.Random;

public class Ex15_ArrayJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10개의 배열안에 1~20사이의 난수를 구해서저장후 출력해보기
		Random r=new Random();
		int []data=new int[10];
		
		Loop:
		for(int i=0;i<data.length;i++)
		{
			data[i]=r.nextInt(20)+1;
			//중복처리 - 같은 숫자 있을경우 다시발생
			for(int j=0;j<i;j++)
			{
				if(data[i]==data[j])
				{
					i--;
					continue Loop;//i++로이동
				}
			}
		}
		
		//출력(한줄에 5개씩 출력)
		for(int i=0;i<data.length;i++)
		{
			System.out.printf("%4d",data[i]);
			if((i+1)%5==0)
				System.out.println();
		}
	}

}
