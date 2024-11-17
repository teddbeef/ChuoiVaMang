public class SoNT {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n; i++) {
            if (isSNT(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
