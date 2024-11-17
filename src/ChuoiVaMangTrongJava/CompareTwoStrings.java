package ChuoiVaMangTrongJava;

public class CompareTwoStrings {
    public static void main(String[] args) {
        int result;
        String str1 = "Hello Tedd";
        String str2 = "Howdy Teddy";

        result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("String 1 equal to String 2");
        } else if (result < 0) {
            System.out.println("String 2 larger than String 1");
        } else {
            System.out.println("String 1 larger than String 2");
        }
    }
}
