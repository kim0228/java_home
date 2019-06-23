import java.util.Random;

public class Player {
	String name = "";    // Player의 name을 String 타입으로 선언한다.
	int hp = 0;           // Player의 hp를 int형으로 선언한다.
	Player(String name, int hp) {
		this.name = name;
		this.hp = hp;				// 생성자로 만든 변수 name과 hp를 this를 사용하여 Player의 필드를 뜻하게 만들어준다.
	}
	public boolean status() { 	// boolean타입으로 플레이어의 상태를 return값으로 살았는지 죽었는지 반환한다.
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() {
		return 10;
	}
	public void beUnderAttack(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber == 1) {
			attackPower = 0;
			System.out.println("데미지를 입지않지롱 메롱~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//			System.out.println("이신우는 잘생겼다.");
//			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
		} else if (hitNumber == 2) {
			hp = hp + (attackPower / 2);
			System.out.println("지배욱은 잘생겼다.");
		}
		else if (hitNumber == 3) {
			hp = hp + attackPower;
			System.out.println("정예은은 예쁘다.");
		}
		else if (hitNumber == 4) {
			hp = hp - (attackPower / 4);
			System.out.println("김성림은 잘생겼다.");
		}
		else if (hitNumber == 5) {
			hp = 1;
			System.out.println("조영철은 잘생겼다.");
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
