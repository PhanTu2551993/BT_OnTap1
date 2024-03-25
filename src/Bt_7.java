import java.util.Arrays;
import java.util.Scanner;

public class Bt_7 {
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
            System.out.print("Nhập giá trị cần chèn: ");
            int addValue = scanner.nextInt();
        while (true){
            System.out.print("Nhập chỉ số cần chèn: ");
            int addIndex = scanner.nextInt();

            if (addIndex < 0 || addIndex >n) {
                System.out.println("Chỉ số chèn không hợp lệ.");
            } else {
                int[] newArr = new int[n+1];
                for (int i = 0; i < n; i++) {
                    newArr[i]=arr[i];
                    newArr[addIndex]=addValue;
                }
                for (int i = addIndex; i < n+1; i++) {
                    newArr[i]=arr[i-1];
                }
                arr=newArr;
                System.out.println(Arrays.toString(arr));
                break;
            }

        }

    }
}

