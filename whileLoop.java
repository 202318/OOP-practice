import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "h";

        while (choice.equals("h")) {
            System.out.println("Hello!");
            System.out.print("Type 'h' to hear it again or anything else to stop: ");
            choice = scanner.nextLine();
        }

        System.out.println("Goodbye!");
    }
}