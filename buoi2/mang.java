import java.util.Scanner;
import java.util.Arrays;
public class mang {
    public static void nhapMang(int a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int a[]) {
        System.out.print("Cac phan tu trong mang: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
public static int timViTri(int a[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so x can tim: ");
        x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static int timMax(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m)
                m = a[i];
        }
        return m;
    }

    public static int timMin(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m)
                m = a[i];
        }
        return m;
    }

    public static int timViTriMax(int a[]) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m])
                m = i;
        }
        return m;
    }

    public static void sapTang(int a[]) {
        Arrays.sort(a);
        System.out.println("\nMang tang dan: " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
        int a[] = new int[n];
        nhapMang(a);
        xuatMang(a);
        System.out.print("\nVi tri la: " + timViTri(a));
        System.out.print("\nPhan tu lon nhat: " + timMax(a));
        System.out.print("\nPhan tu nho nhat: " + timMin(a));
        System.out.print("\nVi tri phan tu lon nhat: " + timViTriMax(a));
        sapTang(a);

    }
}

   