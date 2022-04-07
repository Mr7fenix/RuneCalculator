import java.util.Scanner;

class RuneCalculator {
    private static final Scanner scanner = new Scanner(System.in);

    private static final int [] firstLevel = {0, 16, 17, 17, 17, 17, 18, 18, 18, 18, 18} ;

    private static void main() {
        //Used formula: y = 0,02x^3 + 3,06x^2 + 105,6x - 895

        System.out.println("Welcome to RuneCalculator!");


        System.out.println("Enter start level: ");
        int startLevel = scanner.nextInt();

        System.out.println("Enter final level: ");
        int finalLevel = scanner.nextInt();

        int result = 0;
        if (startLevel < firstLevel.length){
            result = 673;
            if (finalLevel < firstLevel.length){
                for (int i = startLevel; i < finalLevel; i++) {
                    result += firstLevel[i];
                }
                System.out.println("Rune cost: " + result);
                return;
            }else {
                startLevel = 11;
                result = 7496;
            }
        }

        for (int i = startLevel + 1; i <= finalLevel; i++) {

            int nextCost = (int) (0.02 * Math.pow(i, 3) + 3.06 * Math.pow(i, 2) + (105.6 * i) - 895);
            result += nextCost;
        }
        System.out.println("Rune cost: " + result);
    }
}

