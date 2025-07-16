import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split("\\|");
            String word1 = inputArr[0];
            String word2 = inputArr[1];
            HashMap<Character, Integer> word1HashMap = new HashMap<>();
            HashMap<Character, Integer> word2HashMap = new HashMap<>();

            answer += input;

            for (int idx = 0; idx < word1.length(); idx++) {
                char key = word1.charAt(idx);
                if (word1HashMap.containsKey(key)) {
                    word1HashMap.put(key, word1HashMap.get(key) + 1);
                } else {
                    word1HashMap.put(key, 1);
                }
            }

            for (int idx = 0; idx < word2.length(); idx++) {
                char key = word2.charAt(idx);
                if (word2HashMap.containsKey(key)) {
                    word2HashMap.put(key, word2HashMap.get(key) + 1);
                } else {
                    word2HashMap.put(key, 1);
                }
            }

            if (!word1HashMap.equals(word2HashMap) || word1.equals(word2)) {
                answer += " = NOT AN ANAGRAM";
            } else {
                answer += " = ANAGRAM";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
