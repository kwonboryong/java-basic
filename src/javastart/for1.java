package javastart;

public class for1 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//  1. 초기식(처음에만 실행) 2. 조건문 4. 증감(i++)
//            System.out.println(i);      // 3. 실행
//        }

        // i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더하기
        // 1부터 3까지 더하기 (1 + 2 + 3 = 6)
        int sum = 0;
        int endNum = 3;
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + "sum=" + sum);
        }
    }
}
