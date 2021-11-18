class Main {
  public static void main(String[] args) {
    int data = 10;
    // 10진수 정수 -> 2진수 / 8진수 / 16진수 문자열
    System.out.println(Integer.toBinaryString(data));
    System.out.println(Integer.toOctalString(data));
    System.out.println(Integer.toHexString(data));
    // 2진수 / 8진수 / 16진수 문자열 -> 10진수 정수
    System.out.println(Integer.parseInt("1010", 2));
    System.out.println(Integer.parseInt("12", 8));
    System.out.println(Integer.parseInt("a", 16));

    // 문자로 저장하는 방법
    char value1 = 'A';
    char value2 = '가';
    char value3 = '3';
    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
    System.out.println();

    // 정수로 저장하는 방법
    char value4 = 65;
    char value5 = 0xac00;
    char value6 = 51;
    System.out.println(value4);
    System.out.println(value5);
    System.out.println(value6);
    System.out.println();

    // 유니코드로 직접 입력
    char value7 = '\u0041';
    char value8 = '\uac00';
    char value9 = '\u0033';
    System.out.println(value7);
    System.out.println(value8);
    System.out.println(value9);
    System.out.println();
  }
}
