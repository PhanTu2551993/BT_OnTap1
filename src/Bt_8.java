import java.util.Arrays;
import java.util.Scanner;

public class Bt_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng số thực có n phần tử
        int[] arr = new int[n];

        // Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Nhập giá trị mới và chỉ số chèn
        System.out.print("Nhập giá trị cần update: ");
        int updateValue = scanner.nextInt();
        System.out.print("Nhập chỉ số cần update: ");
        int updateIndex = scanner.nextInt();

        // Kiểm tra chỉ số update hợp lệ
        if (updateIndex < 0 || updateIndex > n) {
            System.out.println("Chỉ số update không hợp lệ.");
        } else {
            for (int i = 0; i < n; i++) {
                if (i == updateIndex) {
                    arr[i] = updateValue;
                }
            }

            // In ra mảng sau khi update
            System.out.println("Mảng sau khi update:");
//            for (int num : newArray) {
//                System.out.print(num + " ");
//            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
