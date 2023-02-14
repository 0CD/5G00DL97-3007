import java.util.Scanner;

class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many bottles are there on the wall?");
        int bottleAmount = scanner.nextInt();
        while (bottleAmount > 0) {
            System.out.println(bottleAmount + " bottles of beer on the wall, " + bottleAmount + " bottles of beer.");
            if (bottleAmount != 1 ) {
                System.out.println("Take one down and pass it around, " + (bottleAmount - 1) + " bottles of beer on the wall.");
            }
            else {
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            }
            bottleAmount--;
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, <99> bottles of beer on the wall.");
    }
}