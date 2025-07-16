import java.util.Scanner;

//DONE
public class Problem_1 {
    // this just makes the compiler not yell at me
    // make sure you do all caps for input
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        for (int i = 0; i < numTestCases + 1; i++) {
            int maxOccurrences = 0;
            String phrase = sc.nextLine();
            int[] numChars = new int[26];
            for (int j = 0; j < phrase.length(); j++) {
                if ((int) phrase.charAt(j) == 32) {
                    continue;
                }
                int asciiValue = (int) phrase.charAt(j) - 65;
                // System.out.println(asciiValue);
                numChars[asciiValue]++;
                // System.out.println(
                // "the current index is: " + asciiValue + ", the num of that letter is: " +
                // numChars[asciiValue]);
            }
            for (int k = 0; k < 26; k++) {
                if (numChars[k] > maxOccurrences) {
                    maxOccurrences = numChars[k];
                }
            }
            if (maxOccurrences != 0) {
                System.out.println(maxOccurrences);
            }
        }
        sc.close();
    }
}