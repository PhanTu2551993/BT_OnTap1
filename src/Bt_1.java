import java.util.Arrays;
import java.util.Scanner;

public class Bt_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập số thứ "+(i+1));
            int n = Integer.parseInt(scanner.nextLine());
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
    }
}
