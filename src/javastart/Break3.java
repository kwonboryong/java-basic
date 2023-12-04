package javastart;

public class Break3 {
    public static void main(String[] args) {
        // 1부터 시작하여 숫자를 계속 누적해서 더하다가 합이 10보다 큰 처음 값은 얼마인가?
        int sum = 0;

        for (int i = 1; ; i++) { // 무한반복 / i는 for문에서 선언했기 때문에 for문 안에서만 사용 가능
            sum = sum + i;
            if (sum > 10) { // 참이면 sout 실행, break를 만나 탈출
                System.out.println("합이 10보다 크면 종료: 1=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
