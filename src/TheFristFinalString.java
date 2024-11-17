import java.util.Scanner;

public class TheFristFinalString {
    public static void main(String[] args) {
        //Enter String from keyboard and count the appear of one char
        String str;
        char ch;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        //If the length of the string large than 80 should enter agin
        do {

            System.out.print("Enter the string: ");
            str = scan.nextLine();
        } while (str.length() > 80);

        System.out.print("Enter the char need to count the appearing: ");
        ch = scan.next().charAt(0);

        //Counting and print the number appeard in String
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                count++;
            }
        }
        System.out.println("The counter of char " + ch + " in String " + str + " = " + count);
    }
}
