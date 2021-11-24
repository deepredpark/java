// # python - greedy4 - 1이 될 때까지
// n, k = map(int, input().split())

// count = 0
// while n > 1:
//   if n % k == 0:
//     count += 1
//     n //= k
//   else:
//     count += (n % k)
//     n -= (n % k)
//     if n == 0:
//       count -= 1
// print(count)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    while(n > 1) {
      if(n % k == 0) {
        count += 1;
        n /= k;
      }
      else {
        count += (n % k);
        n -= (n % k);
        if(n == 0) {
          count -= 1;
        }
      }
    }
    System.out.println(count);

  }
}
// dongbinNa code
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // N, K를 공백을 기준으로 구분하여 입력 받기
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int result = 0;

//         while (true) {
//             // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
//             int target = (n / k) * k;
//             result += (n - target);
//             n = target;
//             // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
//             if (n < k) break;
//             // K로 나누기
//             result += 1;
//             n /= k;
//         }

//         // 마지막으로 남은 수에 대하여 1씩 빼기
//         result += (n - 1);
//         System.out.println(result);
//     }

// }
