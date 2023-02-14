import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float score = 0.0f;
        float scoreTotal = 0.0f;
        int scoreAmount = 0;
        float scoreAverage = 0.0f;
        do {
            System.out.println("Give a test score (-1 to quit):");
            score = scanner.nextInt();
            if (score > 0) {
                scoreTotal += score;
                scoreAmount++;
                scoreAverage = scoreTotal / scoreAmount;
                System.out.println("Average: " + scoreAverage);
                continue;
            }
            else {
                break;
            }
        } while (score != -1); 
    }
}