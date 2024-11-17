public class CreateChildInParent {
    public static void main(String[] args) {
        String parentString = "Good Evening Teddy!";

        //Create child String from 13
        String child1 = parentString.substring(0, 12);
        System.out.println(child1);

        //Create child String from 13 to 17
        String child2 = parentString.substring(13);
        System.out.println(child2);
    }
}
