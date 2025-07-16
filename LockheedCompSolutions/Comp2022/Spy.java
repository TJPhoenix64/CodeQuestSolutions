import static java.lang.Character.toLowerCase;
import java.util.HashMap;
import java.util.Scanner;

public class Spy {
    @SuppressWarnings("ConvertToTryWithResources")

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split("\\|");
            char[] charArr1 = inputArr[0].toCharArray();
            char[] charArr2 = inputArr[1].toCharArray();
            HashMap<Character, Integer> word1Map = new HashMap<>();
            HashMap<Character, Integer> word2Map = new HashMap<>();

            for (Character elem : charArr1) {
                elem = toLowerCase(elem);
                if (Character.isLetter(elem)) {
                    if (word1Map.containsKey(elem)) {
                        word1Map.put(elem, word1Map.get(elem) + 1);
                    } else {
                        word1Map.put(elem, 1);
                    }
                }
            }
            for (Character elem : charArr2) {
                elem = toLowerCase(elem);
                if (Character.isLetter(elem)) {
                    if (word2Map.containsKey(elem)) {
                        word2Map.put(elem, word2Map.get(elem) + 1);
                    } else {
                        word2Map.put(elem, 1);
                    }
                }
            }
            boolean isSpy = true;
            for (Character elem : word2Map.keySet()) {
                if (!word1Map.containsKey(elem)) {
                    isSpy = false;
                }
            }
            if (isSpy) {
                answer += "That's my secret contact!";
            } else {
                answer += "You're not a secret agent!";
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}