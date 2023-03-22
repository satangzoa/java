
public class SwitchEX1 {
	public static void main(String[] args) {
		int score = 80;
		char grade;
		
		//90 ~ 100  : A
		//80 ~ 89 : B
		//70 ~ 79 : C
		//60 ~ 69 : D
		//60미만 : F
		
		switch(score/10) {
			case 10:
			case 9:
				grade ='A';
				break;
			case 8:
				grade ='B';
				break;
			case 7:
				grade ='C';
				break;
			case 6:
				grade ='D';
				break;
			default://어떠한 case값도 일치하지 않았을 때
				grade ='F';
				break;
		
		}
		
//		switch(score) {
//		case 100:
//		case 90:
//			grade ='A';
//			break;
//		case 80:
//			grade ='B';
//			break;
//		case 70:
//			grade ='C';
//			break;
//		case 60:
//			grade ='D';
//			break;
//		default://어떠한 case값도 일치하지 않았을 때
//			grade ='F';
//			break;
//	
//	}
		
		System.out.println(score + "점의 등급은 " + grade + "입니다.");
		
	}
}
