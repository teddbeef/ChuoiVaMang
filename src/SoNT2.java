import java.util.Scanner;

public class SoNT2 {
    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sn.nextInt();
        System.out.println("Cac so NT < " + n);

        for (i = 2; i <= n; i++) {
            if (checkSNT(i)) {
                //    System.out.print(i + " ");
                System.out.print(i + " la so NT\n");
                count ++;
            }else{
                System.out.print(i + " ko la so NT\n");
            }
        }
        System.out.print("Co tat ca " + count + " so NT");
    }

    public static boolean checkSNT(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
