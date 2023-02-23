import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        Runnable print = () -> {
            for (Integer i : numbers) {
                System.out.println(i);
            }
        };

        new Thread(print).start();
    }
}