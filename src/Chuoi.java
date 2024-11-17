import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        String chuoi = " ";
        String chuoi2 = "Hello Tedd";
        int dai, length = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai chuoi: ");
        dai = sc.nextInt();
        if (dai == 0) {
            System.out.println(chuoi);
        } else {
            System.out.println(chuoi2);
            length = chuoi2.length();
        }
        System.out.println("Do dai chua chuoi la: " + length);
    }
}

