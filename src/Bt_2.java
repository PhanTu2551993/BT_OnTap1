import java.util.Scanner;

public class Bt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                // Nhập số phần tử của mảng
                System.out.print("Nhập số phần tử của mảng: ");
                int n = scanner.nextInt();

                // Khai báo mảng số thực có n phần tử
                double[] arr = new double[n];

                // Nhập giá trị cho các phần tử của mảng
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                    arr[i] = scanner.nextDouble();
                }

                // Tính tổng các phần tử trong mảng
                double sum = 0;
                for (double num : arr) {
                    sum += num;
                }

                // Tính trung bình cộng và in ra màn hình
                double average = sum / n;
                System.out.println("Giá trị trung bình cộng của các phần tử trong mảng là: " + average);
            }
        }


