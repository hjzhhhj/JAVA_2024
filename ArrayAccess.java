import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양수 5개를 입력하세요.");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int max;
        int min;
        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[i] == arr[i-1] ) {
                max = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = max;
            }
        }
        System.out.println("최댓값은 : "+arr[4]);
        System.out.println("최솟값은 : "+arr[0]);
    }
}
