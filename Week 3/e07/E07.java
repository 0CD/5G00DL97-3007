import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int number = scanner.nextInt();

        System.out.println("Until which multiplier should the table show?");
        int multiplyer = scanner.nextInt();

        int i = 0;
        while (i <= multiplyer) {
            System.out.println(i + " x " + number + " = " + (i * number));
            i++;
        }
    }
}