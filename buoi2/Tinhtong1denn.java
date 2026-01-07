import java.util.Scanner;
public class Tinhtong1denn {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;   // tong = tong + i
        }

        System.out.println("Tong tu 1 den " + n + " = " + tong);
    }
}

