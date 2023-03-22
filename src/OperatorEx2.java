
public class OperatorEx2 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		//&& : short circuit 기능이 있음
		//&: short circuit 기능이 없음
		boolean b1 = a < 10 && ++b > 10; //&&는 앞이 flase면 뒤의 값은 수행시키지 않는다
		System.out.println("b1: " + b1);
		System.out.println("a: " + a + " , b: " + b);
		
		int v1 = 13;
		System.out.println(v1 << 2);
		
		byte b2 = 0x68;
		System.out.println(b2 >> 4);
		
		byte b3 = -12;
		System.out.println(b3 >>> 2);
		
		v1 = v1 +1; // v++와 같다
		v1 += 1; // v1 = v1 +1;와 같다
		
		
		char c1 = 'A'; //A에 해당하는 유니코드값이 65
		System.out.println("c1: " + (int)c1);
		int c2 = 66;
		System.out.println("c2: " + (char)c2);
		
		int diff = 'a' - 'A'; //a가 A보다 유니코드가 크다
		System.out.println("A를 소문자로 변환: " + (char)(c1 + diff));
		
		
		//삼항연산자 활용
		int max;
		int val1 = 10;
		int val2 = 20;
		
		max = val1 > val2 ? val1 : val2;
		
		System.out.println("max: " + max);
		
	}
}





