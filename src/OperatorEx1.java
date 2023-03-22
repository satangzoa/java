
public class OperatorEx1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c;
		
//		a = a + 1;
		++a;
		c = b++; //++가 제일 늦게 수행된다
		
		
		System.out.println("a: " + a);
		System.out.println("b: " + b +", c: " +c);
		
		
		boolean b1 = 10 < 20;
		System.out.println("b1: " + !b1);
		
		
		int v3 = 8  | 5;
		System.out.println("v3: " + v3);
		
		double v4 = 10.0 / 0;
		System.out.println("v4: " + v4);
		
		
		
		
	}
}
