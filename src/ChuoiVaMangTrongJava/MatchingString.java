package ChuoiVaMangTrongJava;

import java.util.Scanner;

/*
để nối 2 chuỗi ký tự lại với nhau thì chúng ta có 2 cách.
Cách thứ nhất là chúng ta dùng dấu + để nối chuỗi (cách này tôi đã đề cập trong các bài trước)
Và cách thứ hai là dùng phương thức concat().
 */
public class MatchingString {
    public static void main(String[] args) {
        String string1 = "", string2 = "", string3 = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        string1 = scan.nextLine();
        System.out.print("Enter your second String: ");
        string2 = scan.nextLine();

        string3 = string1.concat(string2);
        System.out.println(string3);
    }
}
