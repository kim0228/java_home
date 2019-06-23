import java.util.Scanner;

public class Triangle extends Figure { //Triangle클래스는 figure클래스에서 상속받은 자식클래스이다.
	
	String name ="삼각형의 넓이";		// name변수에 문자열을 넣는다.
	int height = 0;
	int bottom = 0;							// height와 bottom변수를 초기화한다.
	String tmp;									// tmp변수를 문자열로 선언한다.
			
	Triangle(){
		this.name = "삼각형의 넓이";			// 생성자를 만들었다.
	}
	
	@Override
	public void inputValue() {			// 부모클래스에서 상속받은 inputValue메소드를 다시 재정의한다.(이것을 override라 한다.)
		// TODO Auto-generated method stub
		
		// super.printResult(); super.는 부모클래스에서 선언된 메소드를 먼저 실행시킨다는 의미이다.
		Scanner scan = new Scanner(System.in);	//	Scanner객체를 생성해서 키보드로 값을 입력받게 한다.
		System.out.println(this.name +"구하기" );
		System.out.println("높이를 입력하세요.");
		tmp = scan.nextLine();			// tmp변수에 키보드로 입력받은 값을 넣는다.
		try {
			this.height = Integer.parseInt(tmp);	//  tmp변수에 입력받은 값이 문자열이기 때문에 int형으로 변환시켜서 height변수에 넣는다.
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요.");		// 그래서, 숫자가 아닌 문자열이 들어간다면 height는 0으로 초기화해서 나오게 된다.
			this.height = 0;
		}
		
		
		System.out.println("밑변의 길이를 입력하세요.");
		tmp = scan.nextLine();			// tmp변수에 키보드로 입력받은 값을 넣는다.
		try {
			this.bottom = Integer.parseInt(tmp);			//  tmp변수에 입력받은 값이 문자열이기 때문에 int형으로 변환시켜서 bottom변수에 넣는다.
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요.");
			this.bottom = 0;				// 그래서, 숫자가 아닌 문자열이 들어간다면 bottom은 0으로 초기화해서 나오게 된다.
		}
		
	}

	public void result () {		// result메소드를 선언한다.
		
		double width=(double)(((this.height * this.bottom)/2));		
		// 삼각형의 넓이를 double형으로 변환시켜서 double형으로 선언된 width변수에 넣는다.
		System.out.println(this.name + "는" + " " +  width + "입니다.");
	}

}
