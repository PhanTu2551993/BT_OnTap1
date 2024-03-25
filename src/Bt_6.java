import java.util.Scanner;

public class Bt_6 {
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
        System.out.println("Nhập so muốn tìm :");
        int findNumber = scanner.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == findNumber){
                sum += arr[i];
                count++;
            }
        }
        System.out.println("\nTổng các phần tử có giá trị " + findNumber + ": " + sum+ " Xuất hiện : "+count+" lần");
    }
}
