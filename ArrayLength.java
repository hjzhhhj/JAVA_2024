import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양수 5개를 입력하세요.");
        int[] arr = new int[5];
        double answer = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            answer += arr[i];
        }
        System.out.println(answer/arr.length);
    }
}
