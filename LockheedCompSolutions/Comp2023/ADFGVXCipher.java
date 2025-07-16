import java.util.Arrays;
import java.util.Scanner;

public class ADFGVXCipher {

    public static char getCharFromTable(String code, char[][] table) {
        if (code.length() != 2) {
            return '!';
        }
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(1);
        String word = "ADFGVX";
        int row = word.indexOf(firstLetter);
        int col = word.indexOf(secondLetter);
        return table[row][col];
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            char[][] charArr = new char[6][6];

            for (int rows = 0; rows < 6; rows++) {
                String input = sc.nextLine();
                for (int idx = 0; idx < input.length(); idx++) {
                    charArr[rows][idx] = input.charAt(idx);
                }
            }
            String transposeWord = sc.nextLine();
            String encryptedStringOfChars = sc.nextLine();
            // all of the input is taken correctly
            /*
             * for (char[] arr : charArr) {
             * System.out.println(Arrays.toString(arr));
             * }
             */

            // System.out.println(transposeWord);
            // System.out.println(encryptedStringOfChars);

            int numRows = encryptedStringOfChars.length() / transposeWord.length() + 1;
            // System.out.println(numRows);
            char[][] EncCharsSortedArr = new char[numRows][transposeWord.length()];
            int charIdx = 0;
            for (int r = 0; r < EncCharsSortedArr.length; r++) {
                // System.out.println("Row: " + r);
                for (int c = 0; c < EncCharsSortedArr[0].length; c++) {
                    char currentLetter = encryptedStringOfChars.charAt(charIdx);
                    // stem.out.println("Current Letter: " + currentLetter + " Char Idx:" +
                    // charIdx);
                    EncCharsSortedArr[r][c] = currentLetter;
                    if (charIdx + 1 == encryptedStringOfChars.length()) {
                        break;
                    }
                    charIdx++;
                }
            }

            for (char[] arr : EncCharsSortedArr) {
                System.out.println(Arrays.toString(arr));
            }

            char[] chars = transposeWord.toCharArray();
            Arrays.sort(chars);
            String transposeWordSorted = new String(chars);
            /*
             * char[][] newEncCharsSortedArr = new char[numRows][transposeWord.length()];
             * for (int idx = 0; idx < transposeWord.length(); idx++) {
             * int newIdx = transposeWord.indexOf(transposeWordSorted.charAt(idx));
             * newEncCharsSortedArr[newIdx] = EncCharsSortedArr[idx];
             * }
             * StringBuilder currentCode = new StringBuilder();
             * for (int r = 0; r < newEncCharsSortedArr.length; r++) {
             * for (int c = 0; c < newEncCharsSortedArr[0].length; c++) {
             * if (currentCode.length() == 2) {
             * answer.append(getCharFromTable(currentCode.toString(),
             * newEncCharsSortedArr));
             * }
             * currentCode.append(newEncCharsSortedArr[r][c]);
             * }
             * }
             * answer.append(Arrays.toString(EncCharsSortedArr));
             */
            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
