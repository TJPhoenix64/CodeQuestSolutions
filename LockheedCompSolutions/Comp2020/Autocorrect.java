import java.util.Scanner;

public class Autocorrect {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int numDictionary = Integer.parseInt(inputArr[0]);
            int numBad = Integer.parseInt(inputArr[1]);
            String[] dictArr = new String[numDictionary];
            String[] badArr = new String[numBad];

            for (int j = 0; j < numDictionary; j++) {
                dictArr[j] = sc.nextLine();
            }
            for (int j = 0; j < numBad; j++) {
                badArr[j] = sc.nextLine();
            }

            // System.out.println(Arrays.toString(dictArr));
            // System.out.println(Arrays.toString(badArr));

            for (String badWords : badArr) {
                int bestMatchNum = badWords.length() + 1;
                String bestMatch = "kk";
                for (String dictionaryWords : dictArr) {
                    if (badWords.length() == dictionaryWords.length()) {
                        int currentMatchNum = 0;
                        for (int idx = 0; idx < dictionaryWords.length(); idx++) {
                            char dictionaryChar = dictionaryWords.charAt(idx);
                            char badChar = badWords.charAt(idx);
                            if (dictionaryChar != badChar) {
                                currentMatchNum++;
                            }
                        }
                        if (currentMatchNum < bestMatchNum) {
                            bestMatchNum = currentMatchNum;
                            bestMatch = dictionaryWords;
                        }
                    }
                }
                answer += bestMatch;
                if (!badWords.equals(badArr[badArr.length - 1])) {
                    answer += "\n";
                }
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}