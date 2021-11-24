// # python - greedy3 - 숫자 카드 게임
// import sys
// input = sys.stdin.readline

// n, m = map(int, input().split())
// result = 0
// for _ in range(n):
//   array = list(map(int, input().split()))
//   result = max(result, min(array))
// print(result)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int num, maxValue;
    int result = 0;
    for(int i = 0; i < n; i++) {
      maxValue = 10001;
      for(int j = 0; j < m; j++) {
        num = sc.nextInt();
        if(num < maxValue) {
          maxValue = num;
        }
      }
      if(maxValue > result) {
        result = maxValue;
      }
    }
    System.out.println(result);
  }
}
