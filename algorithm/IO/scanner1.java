// Scanner 클래스는 생성자로 전달되는 대상으로부터 데이터를 추출하는 기능을 제공하는 클래스이다.
// Scanner import
import java.util.Scanner;

// Scanner 이용하여 두 정수를 입력 받아 A + B 출력하는 프로그램
class Main {
  public static void main(String[] args) {
    // Scanner 객체를 선언한 후 Scanner 클래스의 내장 함수를 사용해 bite 단위로 입력 값을 받아온다.
    // System.io: 키보드를 의미하는 인스턴스 참조변수
    Scanner sc = new Scanner(System.in);
    // next(): 공백 이전까지의 문자를 입력받는다.
    // nextInt(), nextDouble(), nextFloat(), nextLong()...
    // nextLine(): 개행 전까지 문자열 전체를 입력받는다.(한 줄씩 입력받는다.)
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a + b);

    // Scanner 장점: 선언 방식이 비교적 쉽고 간단하다. 그리고 String 뿐만 아니라 double, float, int 등 다양한 자료형으로 입력 값을 저장할 수 있다.
    
    // Scanner 단점: 버퍼 길이가 1024로 한정적이고 한번에 많은 입력 값을 저장하는데 많은 시간이 소요돼 비효율적이다.
  }
}
