import java.util.Scanner;

public class Speeding {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int speed = Integer.parseInt(inputArr[0]);
            String birthdayString = inputArr[1];
            int speed1 = 60;
            int speed2 = 80;

            if (birthdayString.equals("true")) {
                speed -= 5;
            }
            // System.out.println(speed);
            if (speed <= speed1) {
                answer += "no ticket";
            } else if (speed <= speed2) {
                answer += "small ticket";
            } else {
                answer += "big ticket";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}