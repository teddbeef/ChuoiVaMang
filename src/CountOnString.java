import java.util.Scanner;

public class CountOnString {
    public static void main(String[] args) {
        int countLong;
        String chuoi = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text: ");
        chuoi = scan.nextLine();

        countLong = chuoi.length();
        System.out.println("The long of the string is: " + countLong);
    }
}
