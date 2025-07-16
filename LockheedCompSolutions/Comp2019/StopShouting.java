import java.util.Scanner;

public class StopShouting {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                output.append(Character.toLowerCase(input.charAt(j)));
            }
            answer += output;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
