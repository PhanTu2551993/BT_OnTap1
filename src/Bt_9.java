import java.util.Arrays;
import java.util.Scanner;

public class Bt_9 {
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
        // Nhập giá trị mới và chỉ số xóa

        while (true){
            System.out.print("Nhập chỉ số cần xóa: ");
            int deleteIndex = scanner.nextInt();
        // Kiểm tra chỉ số xóa hợp lệ
        if (deleteIndex < 0 || deleteIndex > n) {
            System.out.println("Chỉ số xóa không hợp lệ.");
        } else {
            // Tạo một mảng mới có kích thước nhỏ hơn một
            int[] newArray = new int[n - 1];
            // Sao chép các phần tử từ mảng cũ sang mảng mới, loại bỏ phần tử cần xóa
            for (int i = 0; i < deleteIndex; i++) {
               newArray[i]=arr[i];
            }
            for (int i = deleteIndex; i < n-1; i++) {
                newArray[i]= arr[i+1];
            }
            arr = newArray;
            System.out.println("Mảng sau khi xóa:");
            System.out.println(Arrays.toString(arr));
            break;
        }
    }
}}
