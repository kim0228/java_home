import java.util.Random;

public class 홀수짝수 {
	public static void main(String[] args) {
		Random w = new Random();
		
		int number1 = w.nextInt(100)+1;
		
		System.out.println("랜덤 숫자 : "+ number1);
        // System.out.print("랜덤 숫자 : ");
		// System.out.print(number1);
		// System.out.println(); 
		System.out.println("나머지 : "+ (number1 % 2));
		
		if (number1 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
	}
}