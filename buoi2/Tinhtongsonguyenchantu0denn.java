import java.util.Scanner;

public class Tinhtongsonguyenchantu0denn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 0; i <= n; i += 2)
        {
            tong += i;   // cong so chan
        }

        System.out.println("Tong so chan tu 0 den " + n + " = " + tong);
    }
}
