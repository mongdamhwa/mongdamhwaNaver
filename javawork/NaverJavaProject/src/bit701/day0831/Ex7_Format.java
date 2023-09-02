package bit701.day0831;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex7_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//패턴을 이용해서 다양하게 날짜, 시간 출력하기
		Date date=new Date();
		
		//패턴1
		SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		//요일은 EEE는 요일짧게 (외국으로 치면 sunday가 sun으로 출력)
		//MM:월 mm:분 HH:24시간기준 EEE:요일짧게 
		System.out.println(dateFormat1.format(date));
		
		//패턴2
		//hh 쓸땐 앞에 a붙여야함 a:오전/오후EEEE:요일길게 hh:12시간 기준
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy년MM월dd일 a hh:mm:ss EEEE");
		System.out.println(dateFormat2.format(date));
		
		//숫자를 포멧 양식에 맞게 출력하기
		int money=4567890;
		NumberFormat numberFormat1=NumberFormat.getInstance();
		//NumberFormat도 Calendar처럼 public이 아닌 몇없는 protected라서 getInstance 씀
		System.out.println(numberFormat1.format(money));//4,567,890 쉼표가 찍히네
		
		NumberFormat numberFormat2=NumberFormat.getCurrencyInstance();
		/*그냥 반환만 필요할땐 겟인스턴스 쓰면 되는데
		 * 해당지역의 지역설정된 화폐단위 붙여서 출력 할땐 그냥 인스턴스 말고 currency붙이면됨
		 */
		System.out.println(numberFormat2.format(money));
		
		double num=456.12345;
		System.out.println(numberFormat1.format(num));
		
		numberFormat1.setMaximumFractionDigits(1);//소주점 한자리로 출ㄺ
		System.out.println(numberFormat1.format(num));//456.1
		
		
		//get은 반환, set은 변환? 둘 차이 알려줬는데 찾아보기
	}

}
