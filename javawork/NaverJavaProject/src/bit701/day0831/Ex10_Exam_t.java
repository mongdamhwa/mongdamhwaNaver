package bit701.day0831;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex10_Exam_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		상품명과 수량, 단가를 각각 입력 받은후 총 금액을 출력하기
		그리고 수량이 5개 이상인 경우 10프로 할인된 최종 금액도 출력하기
		
		예)
		상품명: 딸기
		수량: 6
		단가: 1000
		
		총금액: 6000원
		5개 이상 10프로 할인된 금액: 5400원
		*/
		
		//이건 선생님 풀이
		//선언 - 계산 -출력 순서로
		
		//선언 
		Scanner sc = new Scanner(System.in);
		NumberFormat numFormat=NumberFormat.getInstance();
		String sangpum="";
		int su=0,dan=0,total=0;
		
		//입력
		System.out.println("상품명");
		sangpum=sc.nextLine();
		System.out.println("수량");
		su=sc.nextInt();
		System.out.println("단가");
		dan=sc.nextInt();
		
		//계산
		//총금액
		total=su*dan;
		
		//출력
		System.out.println("총금액="+numFormat.format(total)+"원");
		
		//5개 이상일때 할인받는 조건 추가
		if(su>=5)
		{
			//total=total*0.9; 이렇게 쓰면 오류남 토탈이 int인데 0.9는 double이니까 그걸 곱해버리니 오류나지
			total=(int)(total*0.9);//이렇게 형변환해주면 되지
			System.out.printf("5개 이상 10프로 할인된 금액 : %d원\n",total);
			System.out.printf("5개 이상 10프로 할인된 금액 : %s원\n",numFormat.format(total));/*여기선 %d가 아닌 %s로 쓰는이유
			설명했는데 못들음*/
			System.out.printf("5개 이상 10%% 할인된 금액 : %s원\n",numFormat.format(total)); /*만약 printf 일때 10프로를 10%로 쓴다면 
			%를 변환기호로 인식하는데 변환기호 다음 공백이 나오니 오류가 뜸
			%를 단순히 %글자로 인식하게 하고싶으면 %%라고 쓰면 됨. printf에서만 해당됨*/
			
		}
	}

}
