
public abstract class Figure {		// 추상 클래스 figure를 만들었다. 이 추상클래스에는 객체를 만들 수 없다.
	String name = "도형 넓이 구하기";		// name변수에 "도형 넓이 구하기"라는 문자열을 담는다.
	public abstract void inputValue();		// 추상 메소드 inputValue를 선언하였다. 여기서는 메소드를 구현할 수 없다.
	public void printResult() {			// printResult메소드를 선언하였다.
		System.out.println(this.name);
	}
}
