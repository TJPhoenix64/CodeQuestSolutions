import java.util.Scanner;

public class NullCipher {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            boolean hadVowel = false;
            for (int idx = 0; idx < input.length(); idx++) {
                char elem = input.charAt(idx);
                if (hadVowel) {
                    answer.append(elem);
                    hadVowel = false;
                } else {
                    if (elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u') {
                        hadVowel = true;
                    }
                }

            }
            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
