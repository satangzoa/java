
public class IfEx1 {
	public static void main(String[] args) {
		int score = 55;
		char grade;
		
		//100 ~ 90  : A
		//89 ~ 80 : B
		//79 ~ 70 : C
		//69 ~ 60 : D
		//60미만 : F
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else  
			grade = 'F';
		
		
		System.out.println(score + "점의 등급은 " + grade + "입니다.");
		
		
		
		
	}
}
