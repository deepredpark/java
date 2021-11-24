// # python - implementaion2 - 시각
// n = int(input())

// count = 0
// for h in range(n + 1):
//   for m in range(60):
//     for n in range(60):
//       if '3' in str(h) + str(m) + str(n):
//         count += 1
// print(count)

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    for(int h = 0; h < n + 1; h++) {
      for(int m = 0; m < 60; m++) {
        for(int s = 0; s < 60; s++) {
          String time = String.valueOf(h) + String.valueOf(m) + String.valueOf(s);
          if(time.indexOf("3") != -1) {
            count += 1;
          }
        }
      }
    }

    System.out.println(count);

  }
}

// dongbinNa code
// import java.util.*;

// public class Main {

//     // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
//     public static boolean check(int h, int m, int s) {
//         if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
//             return true;
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // H를 입력받기 
//         int h = sc.nextInt();
//         int cnt = 0;

//         for (int i = 0; i <= h; i++) {
//             for (int j = 0; j < 60; j++) {
//                 for (int k = 0; k < 60; k++) {
//                     // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
//                     if (check(i, j, k)) cnt++;
//                 }
//             }
//         }

//         System.out.println(cnt);
//     }

// }
