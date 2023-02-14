import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int number = scanner.nextInt();

        int i = 0;
        while (i <= 10) {
            System.out.println(i + " x " + number + " = " + (i * number));
            i++;
        }
    }
}