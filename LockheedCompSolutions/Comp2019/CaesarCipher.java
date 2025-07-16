import java.util.Scanner;

public class CaesarCipher {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            int shift = Integer.parseInt(sc.nextLine());
            String[] message = sc.nextLine().split(" ");
            for (String words : message) {
                for (int j = 0; j < words.length(); j++) {
                    char letter = words.charAt(j);
                    int num = (int) letter;
                    num -= shift;

                    if (num < 97) {
                        num += 26;
                    }
                    char newLetter = (char) num;
                    answer.append(newLetter);
                }
                answer.append(" ");
            }

            // answer.append((int) 'a');

            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
