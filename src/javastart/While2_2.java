package javastart;

public class While2_2 { // i부터 하나씩 증가하여 endNum까지 더하기 (i~endNum)

    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // 첫번째 수
        int endNum = 10; // 마지막 더할 수

        while (i <= endNum) { //i=1, endNum=3
        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        }
    }
}
