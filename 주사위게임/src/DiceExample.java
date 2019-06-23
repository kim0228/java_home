import java.util.Random;
import java.util.Scanner;

    public class DiceExample {
	public static void main(String[] args) {
	
	int dicenum; 
	
	Random d = new Random();	
	
	Scanner x = new Scanner(System.in);
	System.out.println("주사위 숫자를 입력하세요 :  ");	
	
	dicenum = d.nextInt(6)+1;

	if (dicenum == 1) {
		System.out.println("멍멍");
          } else if (dicenum == 2) {
		System.out.println("야옹");
          } else if (dicenum == 3) {
		System.out.println("3");
          } else if (dicenum == 4) {
		System.out.println("4");
          } else if (dicenum == 5) {
		System.out.println("5");
          } else if (dicenum == 6) {
		System.out.println("6");
          }
     }
}