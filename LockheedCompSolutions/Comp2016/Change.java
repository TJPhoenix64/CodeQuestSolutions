import java.util.Scanner;

public class Change {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            answer += input + "\n";
            double value = Double.parseDouble(input.substring(1)) * 100;
            int num = (int) Math.round(value);
            int numQuarters = (int) (num / 25);
            num = num % 25;
            int numDimes = (int) (num / 10);
            num = num % 10;
            int numNickels = (int) (num / 5);
            num = num % 5;
            int numPennies = (int) (num);
            answer += "Quarters=" + numQuarters + "\n";
            answer += "Dimes=" + numDimes + "\n";
            answer += "Nickels=" + numNickels + "\n";
            answer += "Pennies=" + numPennies;

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
