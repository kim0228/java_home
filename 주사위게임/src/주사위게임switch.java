import java.util.Scanner;
import java.util.Random;

    public class 주사위게임switch {
	public static void main(String[] args) {
	
	Random d = new Random();
	int dicenum;

	System.out.println("주사위 숫자를 입력하시오:  ");	
	
	dicenum = d.nextInt(6)+1;

	switch (dicenum) {	
	case 1 : 
	   System.out.print("멍멍");
	   break;
	case 2 :
	   System.out.print("야옹");
	  break;
	case 3 : 
	   System.out.print("3");
	   break;
	case 4 :
	   System.out.print("4");
		break;
	case 5 : 
	   System.out.print("5");
	   break;
	case 6 :
	   System.out.print("6");
	   break;
		}
	}
}	
