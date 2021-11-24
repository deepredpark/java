// # python - greedy2 - 큰수의 법칙
// import sys
// input = sys.stdin.readline

// n, m, k = map(int, input().split())
// array = list(map(int, input().split()))
// array.sort()
// maxNum = array[-1]
// subMaxNum = array[-2]

// result = (maxNum * k + subMaxNum) * (m // (k + 1))
// result += maxNum * (m % (k + 1))
// print(result)

import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[] array = new int[n];
    int maxNum, subMaxNum, result;

    for(int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    Arrays.sort(array);
    maxNum = array[n - 1];
    subMaxNum = array[n - 2];
    result = (maxNum * k + subMaxNum) * (m / (k + 1));
    result += maxNum * (m % (k + 1));
    System.out.println(result);
  }
}

// dongbinNa code
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // N, M, K를 공백을 기준으로 구분하여 입력 받기
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int k = sc.nextInt();

//         // N개의 수를 공백을 기준으로 구분하여 입력 받기
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr); // 입력 받은 수들 정렬하기
//         int first = arr[n - 1]; // 가장 큰 수
//         int second = arr[n - 2]; // 두 번째로 큰 수

//         // 가장 큰 수가 더해지는 횟수 계산
//         int cnt = (m / (k + 1)) * k;
//         cnt += m % (k + 1);

//         int result = 0;
//         result += cnt * first; // 가장 큰 수 더하기
//         result += (m - cnt) * second; // 두 번째로 큰 수 더하기

//         System.out.println(result);
//     }

// }
