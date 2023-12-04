package javastart;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
// do while - 최초 한 번은 코드를 꼭 실행해야 하는 경우에 사용
        do {
            System.out.println("현재 숫자는:" + i);
            i++; // 일단 먼저 실행
        } while (i < 3); // 실행한 뒤 조건 확인, 참이면 다음 실행 (거짓이면 탈출)
    }
}
