// # python - implementaion1 - 상하좌우
// import sys
// input = sys.stdin.readline
// dx = [-1, 1, 0, 0]
// dy = [0, 0, -1, 1]
// direction = ['U', 'D', 'L', 'R']
// x, y = (1, 1)

// n = int(input())
// commands = list(input().split())
// for command in commands:
//   for i in range(4):
//     if command == direction[i]:
//       nx = x + dx[i]
//       ny = y + dy[i]
//       if nx >= 1 and nx <= n and ny >= 1 and ny <= n:
//         x, y = nx, ny
// print(x, y)

import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    String[] direction = {"U", "D", "L", "R"};
    int x = 1, y = 1;

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); // 버퍼 비우기
    String[] commands = sc.nextLine().split(" ");
    for (String command : commands) {
      for(int i = 0; i < 4; i++) {
        if(command.equals(direction[i])) {
          int nx = x + dx[i];
          int ny = y + dy[i];
          if(nx >= 1 && nx <= n && ny >= 1 && ny <= n) {
            x = nx;
            y = ny;
          }
        }
      }
    }

    System.out.println(x + " " + y);

  }
}

// dongbinNa code
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // N을 입력받기
//         int n = sc.nextInt();
//         sc.nextLine(); // 버퍼 비우기
//         String[] plans = sc.nextLine().split(" ");
//         int x = 1, y = 1;

//         // L, R, U, D에 따른 이동 방향 
//         int[] dx = {0, 0, -1, 1};
//         int[] dy = {-1, 1, 0, 0};
//         char[] moveTypes = {'L', 'R', 'U', 'D'};

//         // 이동 계획을 하나씩 확인
//         for (int i = 0; i < plans.length; i++) {
//             char plan = plans[i].charAt(0);
//             // 이동 후 좌표 구하기 
//             int nx = -1, ny = -1;
//             for (int j = 0; j < 4; j++) {
//                 if (plan == moveTypes[j]) {
//                     nx = x + dx[j];
//                     ny = y + dy[j];
//                 }
//             }
//             // 공간을 벗어나는 경우 무시 
//             if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
//             // 이동 수행 
//             x = nx;
//             y = ny;
//         }

//         System.out.println(x + " " + y);
//     }

// }
