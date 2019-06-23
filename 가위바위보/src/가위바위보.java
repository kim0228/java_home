import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

   public static void main(String[] args) {

      int 내가낸거; // 내가 낸거 담을 변수 설정
      int 컴터가낸거; // 컴터가 낸거 담을 변수 설정

      Scanner s = new Scanner(System.in); // 스캐너 객체 생성, 사용자에게 입력받기 위해 필요한놈임
      
      내가낸거 = s.nextInt(); // 입력한거 내가낸거라는 변수명에 대입.

      while (true) { // while 문의 괄호()가 true 기 때문에 while문 실행.

         if (내가낸거 == 1 || 내가낸거 == 2 || 내가낸거 == 3) { // 내가 입력한 숫자 1 2 3 에 대해
                                                     // 1개만이라도 조건이 맞으면! 이라는 뜻
                                                                   // 1. 가위 2.바위 3.보 설정
            break; // 그렇다면, break 로 while 문 탈출함.

         } else { // 그렇지 않다면 = 1 2 3 말고 다른걸 입력했다면

            System.out.println("숫자똑바로 입력해라"); // 숫자 똑바로 입력하라는 메시지 출력

            내가낸거 = s.nextInt(); // 숫자 똑바로 입력하라는 메시지 출력 이후 다시 입력값 받음.
                           // while 문 안에 있기때문에 다시 받은 입력값으로 while 다시 실행.
         }

      }

      Random r = new Random(); // 컴터가 랜덤으로 값을 뿌리기에 랜덤객체 생성

      컴터가낸거 = r.nextInt(3) + 1; // 3을 적으면 0 1 2 를 뽑아내기 때문에 뒤에 +1을 해줌으로써 1 2 3 뽑아냄
                        
      if (내가낸거 == 컴터가낸거) {   // 내가 낸거랑 컴터가 낸것이 같다면.

         System.out.println("비김");  // 비겼으니까 비김 출력

      } else if (내가낸거 - 컴터가낸거 == 1 || 내가낸거 - 컴터가낸거 == -2) {  // 내가낸거와 컴터가 낸거의 차가 1 또는 2라면 다 이긴경우 
                                                             // 차이가 1이라면 1.가위와 2.바위 경우, 2.바위와 3.보 2가지경우 인데,
         System.out.println("이김");                                // 차이가 1이 나오려면 내가 2.바위일때 컴터가 1.가위, 내가 3.보 일때, 컴터가 2.바위일 경우임
                                                             // 해당경우 이 else if 문으로 들어와서 이김 처리. 나머지경우는 else 로 다 짐 처리.
      } else {                                                                // 차이가 -2일 경우도 동일처리
         System.out.println(내가낸거 - 컴터가낸거);
         System.out.println("짐");
      }

   }

}