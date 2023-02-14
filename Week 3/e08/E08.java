import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("Give a number (0 to quit):");
            number = scanner.nextInt();
            if (number != 0) {
                if (number % 2 == 1) {
                    System.out.println("Number is odd");
                }

                else if (number % 2 == 0) {
                    System.out.println("Number is even");
                }
            }
        } while (number != 0);
    } 
}