package bit701.day0906;

import java.util.Random;

public class Ex16_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6개 할당된  lotto 변수에 1~45 사이의 난수를 발생하는데
		(중복된경우 다시 발생) 오름차순 정렬로 출력하시오
		오늘자 ex13과 ex15합친예제*/

		/* 내버전 말그대로 13과 15예제 복붙 섞어서 한거라 이해없이 했음..출력은 됨
		Random r=new Random();
		int []data=new int[6];
		
		Loop:
			for(int i=0;i<data.length;i++)
			{
				data[i]=r.nextInt(45)+1;
				//중복처리 - 같은 숫자 있을경우 다시발생
				for(int j=0;j<i;j++)
				{
					if(data[i]==data[j])
					{
						i--;
						continue Loop;//i++로이동
					}
		
		
					if(data[i]<data[j])
					{
						int temp=data[i];
						data[i]=data[j];
						data[j]=temp;
					}
		
				}
			}
		
		for(int i=0;i<data.length;i++)
		{
			System.out.printf("%4d",data[i]);
			if((i+1)%6==0)
				System.out.println();
		}
		*/
		
		int[] lotto=new int[6];
		//중복되지 않은 난수 발생
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;//현재 반복문을 빠져나간후 i++로 이동
				}
			}
		}
		//정렬
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//출력
		for(int n:lotto)
		{
			System.out.printf("%4d",n);
		}
		

	}

}
