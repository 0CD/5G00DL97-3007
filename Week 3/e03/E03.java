import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numberOne = scanner.nextInt();
        scanner.close();
        if (numberOne > 0) {
            System.out.println("Positive number");
        }
        else if (numberOne < 0) {
            System.out.println("Negative number");
        }
    }
}