package bit701.day0901;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex3_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		이름, 3과목의 점수(kor,eng,mat)를 입력받은 후,
		총점과 평균(소수점 1자리출력 NumberFornat 이용)
		그리고 등급을 출력(grade : 평균 90이상은 "Excellent"
		80이상은 "Good, 나머지는 "Try"라고 출력)"
		if~else사용해서 구하기
		 */

		/*
		이건 내거 시간내에 못품
		Scanner sc = new Scanner(System.in);
		NumberFormat numFormat=NumberFormat.getInstance();
		int kor=0,eng=0,mat=0, average=0;
		
		//입력
		System.out.println("국어점수");
		kor=sc.nextInt();
		System.out.println("영어점수");
		eng=sc.nextInt();
		System.out.println("수학점수");
		mat=sc.nextInt();
		
		//계산
		//총금액
		average=(kor+eng+mat)/3;
		
		//출력
		System.out.println("평균은 "+numFormat.format(average)+" 입니다");
		
		if(average>=90)
		{
			System.out.println("grade 는");
			System.out.printf("5개 이상 10프로 할인된 금액 : %s원\n",numFormat.format(total));여기선 %d가 아닌 %s로 쓰는이유
			설명했는데 못들음
			System.out.printf("5개 이상 10%% 할인된 금액 : %s원\n",numFormat.format(total)); 만약 printf 일때 10프로를 10%로 쓴다면 
			%를 변환기호로 인식하는데 변환기호 다음 공백이 나오니 오류가 뜸
			%를 단순히 %글자로 인식하게 하고싶으면 %%라고 쓰면 됨. printf에서만 해당됨
			
		}
		*/
		
		
		//쌤풀이
		//선언
		Scanner sc = new Scanner(System.in);
		NumberFormat format=NumberFormat.getInstance();
		format.setMaximumFractionDigits(1);
		String name="";
		int kor,eng,mat,total=0;
		double avg=0;
		String grade= "";
		
		//입력
		System.out.println("이름입력");
		name=sc.nextLine();
		System.out.println("국어점수입력");
		kor=sc.nextInt();
		System.out.println("영어점수입력");
		eng=sc.nextInt();
		System.out.println("수학점수입력");
		mat=sc.nextInt();
		
		//계산
		total=kor+eng+mat;
		avg=total/3.0;
		if(avg>=90) grade="Excellent";
		else if(avg>=80) grade="Good";
		else grade="try";
		
		//출력
		System.out.println("이름 :"+name);
		System.out.println("국어점수 :"+kor+"점");
		System.out.println("영어점수 :"+eng+"점");
		System.out.println("수학점수 :"+mat+"점");
		System.out.println("총점 :"+total+"점");
		System.out.println("평균 :"+format.format(avg)+"점");
		System.out.println("평가 :"+grade);

	}

}
