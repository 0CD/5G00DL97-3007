import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Give a number: ");
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        System.out.println(numberOne + " x " + numberTwo + " = " + (numberOne * numberTwo));
        System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
        
    }
}