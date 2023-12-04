package javastart;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // 1부터 시작해서 숫자를 계속 누적해서 더하다가 합이 10보다 처음으로 큰 값은 얼마인가?
        while(true) { // 무한 반복
            sum = sum + i; // sum = 1 +2 +3
            // 0+1=1(sum) i++=2 / 1+2=3(s) i++=3 / 3+3=6(s) i++=4 / 6+4=10(s) i++=5 / 10+4=15(s) > 10 = true! (sout 실행, i++ 실행 X)
            if (sum > 10) { // 참이면 실행, 거짓이면 아래 i++ 실행
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // 참이면 실행 후 탈출
            }
            i++;
        }
    }
}
