package javastart;

public class While1_1 {

    public static void main(String[] args) {
        int count = 0;

        while (count < 3) { // (0, 1, 2 < 3) -> true -> 실행됨
            count = count + 1; // 한 번 실행될 때마다 같이 실행됨
            System.out.println("현재 숫자는:" + count); // 한 번 실행될 때마다 같이 출력
        }
    }
}
