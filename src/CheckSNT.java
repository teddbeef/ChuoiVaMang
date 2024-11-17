import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        int n;
        int i;
        boolean isSNT = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so NT: ");
        n = scanner.nextInt();

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isSNT = false;
                break;
            }
        }
        if (isSNT) {
            System.out.println(n + " la so nguyen to");
        }else{
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
