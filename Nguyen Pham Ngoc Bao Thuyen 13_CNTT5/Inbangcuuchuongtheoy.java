import java.util.Scanner;
public class Inbangcuuchuongtheoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so (bang cuu chuong can in): ");
        int n = sc.nextInt();

        System.out.println("Bang cuu chuong " + n);

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
