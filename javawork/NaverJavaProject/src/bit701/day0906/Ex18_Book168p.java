package bit701.day0906;

public class Ex18_Book168p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] season = {"spring","summer","fall","winter"};
		
		System.out.println("season[0]:"+season[0]);
		System.out.println("season[1]:"+season[1]);
		System.out.println("season[2]:"+season[2]);
		System.out.println("season[3]:"+season[3]);
		
		season[1]="여름";
		System.out.println("season[1]:"+season[1]);
		
		
		int[] score= {86, 85, 84};
		int sum=0;
		for(int i=0;i<score.length;i++)
		{
			sum+=score[i];
		}
		System.out.println("총합 :"+sum);
		double avg=(double)sum/3;
		System.out.println("평균 :"+avg);
		
	}

}
