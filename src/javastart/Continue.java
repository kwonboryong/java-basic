package javastart;

public class Continue {
    public static void main(String[] args) {
        int i = 1;

    // 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.
        while (i <= 5) { // i = 1, 2, 3, 4, 5
            if (i == 3) {
                i++; // i가 3이면 실행 = 4
                continue; // i가 3이면 아래(sout, i++;)까지 다 건너뛰고 처음의 while문 조건식으로 감
            }
            System.out.println(i);
            i++;
        }
    }
}
