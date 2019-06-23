import java.util.Scanner;
public class 홀수짝수의합if문 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		int totalScore = 0;
		int evenScore = 0;
		int oddScore = 0;
				
		for (i = 1; i <= 100; i++) {
		totalScore = totalScore + i;			// totalScore += i;이랑 똑같은 의미이다.
		if (i % 2 == 0) {
			   evenScore = evenScore + i; 
			   oddScore = totalScore - evenScore;
	 		} 
		}
		System.out.println("1부터 100까지의 합은: " + totalScore + "입니다.");
		System.out.println("짝수의 합은: " + evenScore + "입니다.");
		System.out.println("홀수의 합은: " + oddScore + "입니다.");
		}

	}