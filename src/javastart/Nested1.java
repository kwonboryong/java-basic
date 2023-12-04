package javastart;

public class Nested1 {
    public static void main(String[] args) {

    // 중첩 반복문
        for (int i = 0; i < 2; i++) { // 첫 번째 수행 / (첫 번째 전체 수행 후) 두 번째 수행
            System.out.println("외부 for 시작 i: " + i);
            for (int j = 0; j < 3; j++) { // 첫 번째 - 3회 수행 / 두 번째 - 3회 수행
                System.out.println("내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i); // 첫 번째 수행 / 두 번째 수행
            System.out.println(); // 한 줄 띄우기
        }
    }
}
