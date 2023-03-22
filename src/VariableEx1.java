
public class VariableEx1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		int d;
		System.out.println("c: " + c);
//		초기화 되지 않은 지역변수는 사용 할 수 없음
//		System.out.println("d: " + d);
		
		short s1 = 32767;
		s1++;
//		-32768의 결과가 출력된다.
		System.out.println("s1: " + s1);
		
		long v1= 128;
		byte v2 = (byte)v1;
		System.out.println("v2: " + v2);
		
		
		//실수를 정수로 형변환(castiong)
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println("pi2: " + pi2);
		
		//묵시적 형변환이 문제를 일으킨 경우는 명시적 형변환이 필요하다
		short s2 = 10;
//		short s3 = s2 + 20; //오류발생
		short s3 = (short)(s2 + 20);
		System.out.println("s3: " + s3);
		
		
	}
}











