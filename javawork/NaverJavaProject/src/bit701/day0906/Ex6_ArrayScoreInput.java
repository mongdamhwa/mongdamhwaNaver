package bit701.day0906;

import java.util.Scanner;

public class Ex6_ArrayScoreInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*score에 5개의 배열 할당후 키보드로 직접 점수를 입력하여 배열에 저장후
		총점과 평균을 구하세요*/
		Scanner sc= new Scanner(System.in);
		/*내버전
		int []arr =new int[5];
		int sum=0;
		double avg=0;
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
			sum+=arr[i];
		}
		
		avg=(double)sum/arr.length;
		System.out.println("총 점수개수:"+arr.length);
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);*/
		
		
		//쌤버전
		//변수선언
		int []score =new int[5];
		int sum=0;
		double avg=0;
		//입력
		for(int i=0;i<score.length;i++)
		{
			System.out.println(i+"번 점수입력:"); //나는 이걸 안넣어줘서 실행이 안되었나보다
			score[i]=sc.nextInt();
			//조건추가 : 0보다 작거나 100보다 크면 "0~100 사이의 점수로 입력바람" 출력후 다시입력
			//continue 이용해서 작성해보기
			if(score[i]<0 || score[i]>100)
			{
				System.out.println("\t0~100사이 점수로 입력바람");
				i--;//미리 1감소후 i++에서 1증가되므로 다시 제자리에 입력, 
				//이거 안쓰고 바로 i++로 이동하면 바로 그 다음 인덱스 입력하게 되는꼴
				//만약 0번점수 입력 90 하고 1번점수입력때 110 입력하면 잘못된점수니 다시 1번점수 입력해야하는데
				//i--;로 미리 1감소 안해놓으면 1번점수가 아닌 바로 2번점수입력으로 넘어가게됨
				continue;//i++로 이동
			}
			
			sum+=score[i];
		}
		//계산
		avg=(double)sum/score.length;		
		//출력
		
		System.out.println("입력한 점수들");
		for(int n:score)
			System.out.printf("%5d",n);
		System.out.println("\n총점:"+sum);
		System.out.println("평균:"+avg);
	}

}
