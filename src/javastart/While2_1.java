package javastart;

public class While2_1 { // 숫자 1부터 더하기 (1+2+3...)

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++; // i = 2

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++; // i = 3

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
    }
}
