import java.util.Scanner;

public class AEIOU {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            int numChars = 0;
            for (int j = 0; j < input.length(); j++) {
                char letter = input.charAt(j);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    numChars++;
                }
            }
            answer += numChars;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
