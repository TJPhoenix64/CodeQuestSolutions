import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int num = Integer.parseInt(sc.nextLine());
            boolean isPalindrome = true;
            ArrayList<Integer> badList = new ArrayList<>();
            for (int j = 1; j <= num; j++) {
                String input = sc.nextLine();
                int size = input.length();
                String firstHalf = input.substring(0, size / 2);
                ArrayList<Character> firstList = new ArrayList<>();
                for (int idx = 0; idx < firstHalf.length(); idx++) {
                    char elem = firstHalf.charAt(idx);
                    elem = Character.toLowerCase(elem);
                    firstList.add(elem);
                }
                String secondHalf = input.substring(size - size / 2, size);
                ArrayList<Character> secondList = new ArrayList<>();
                for (int idx = 0; idx < secondHalf.length(); idx++) {
                    char elem = secondHalf.charAt(idx);
                    elem = Character.toLowerCase(elem);
                    secondList.add(elem);
                }
                Collections.reverse(secondList);
                if (!firstList.equals(secondList)) {
                    isPalindrome = false;
                    badList.add(j);
                }
            }

            if (isPalindrome) {
                answer += "True";
            } else {
                answer += "False - ";
                for (int j = 0; j < badList.size(); j++) {
                    answer += badList.get(j);
                    if (j + 1 != badList.size()) {
                        answer += ", ";
                    }
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