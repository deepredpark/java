// # python - implementaion3 - 왕실의 나이트
// position = input()
// dx = [-2, -2, 2, 2, -1, -1, 1, 1]
// dy = [-1, 1, -1, 1, -2, 2, -2, 2]

// x = int(position[1]) - 1
// y = ord(position[0]) - ord('a')
// count = 0
// for i in range(8):
//   nx = x + dx[i]
//   ny = y + dy[i]
//   if nx >= 0 and nx < 8 and ny >= 0 and ny >= 0:
//     count += 1
// print(count)

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String position = sc.next();
    int x = position.charAt(1) - '1'; 
    int y = position.charAt(0) - 'a';
    
    int[] dx = {-2, -2, 2, 2, -1, -1, 1, 1};
    int[] dy = {-1, 1, -1, 1, -2, 2, -2, 2};
    int count = 0;
    for(int i = 0; i < 8; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if(nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
        count += 1;
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

//         // 현재 나이트의 위치 입력받기
//         String inputData = sc.nextLine();
//         int row = inputData.charAt(1) - '0';
//         int column = inputData.charAt(0) - 'a' + 1;

//         // 나이트가 이동할 수 있는 8가지 방향 정의
//         int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
//         int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

//         // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
//         int result = 0;
//         for (int i = 0; i < 8; i++) {
//             // 이동하고자 하는 위치 확인
//             int nextRow = row + dx[i];
//             int nextColumn = column + dy[i];
//             // 해당 위치로 이동이 가능하다면 카운트 증가
//             if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
//                 result += 1;
//             }
//         }

//         System.out.println(result);
//     }

// }
