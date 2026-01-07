import java.util.Scanner;

public class cacsonguyentotu1denn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("Cac so nguyen to tu 1 den " + n + " la:");

        for (int i = 2; i <= n; i++) {
            boolean laNguyenTo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    laNguyenTo = false;
                    break;
                }
            }

            if (laNguyenTo) {
                System.out.print(i + " ");
            }
        }
    }
}
