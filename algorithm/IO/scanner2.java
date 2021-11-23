import java.util.Scanner;

// Scanner 이용하여 입력받은 정수의 숫자만큼 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String k = new String("*");
    for(int i = 1; i < (n + 1); i++) {
      System.out.println(k.repeat(i));
    }
  }
}
