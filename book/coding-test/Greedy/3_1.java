// # python - greedy1 - 거스름돈
// coins = [500, 100, 50, 10]
// n = int(input())
// count = 0
// for coin in coins:
//   if n >= coin:
//     count += n // coin
//     n %= coin

// if n == 0:
//   print(count)
// else:
//   print("impossible")

import java.util.Scanner;

// Scanner 이용하여 입력받은 정수의 숫자만큼 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] coins = new int[]{500, 100, 50, 10};
    int count = 0;
    for(int coin: coins) {
      count += (n / coin);
      n %= coin;
    }
    if(n == 0) {
      System.out.println(count);
    } else {
      System.out.println("impossible");
    }
  }
}
