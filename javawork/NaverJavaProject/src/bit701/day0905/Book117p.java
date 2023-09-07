package bit701.day0905;

public class Book117p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random과 중첩if문
		int score = (int)(Math.random()*20)+81;
		System.out.println(("점수: "+score));
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
		}else {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B";
			}
			
			System.out.println("학점: "+grade);
		}
	}

}
