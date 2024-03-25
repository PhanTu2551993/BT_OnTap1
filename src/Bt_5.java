import java.util.Scanner;

public class Bt_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng :");
        int rows = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số cột :");
        int cols = Integer.parseInt(scanner.nextLine());

        // khai ba mảng
        int[][] arr = new int[rows][cols];
        System.out.println("Nhập giá trị cho các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử ở dòng " + (i + 1) + ", cột " + (j + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // In ra mảng 2 chiều theo ma trận
        System.out.println("Các phần tử chẵn của mảng 2 chiều :");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] %2 == 0) {
                    System.out.print(arr[i][j] + "\t");
                    sum += arr[i][j];
                }
            }

        }System.out.println();
        System.out.println("Tổng của các phần tử chan trong mang la :");
        System.out.println(sum);
    }
}
