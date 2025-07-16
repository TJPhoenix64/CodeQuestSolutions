import java.util.HashMap;
import java.util.Scanner;

public class Transactions {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int categories = Integer.parseInt(input[0]);
            int transactions = Integer.parseInt(input[1]);
            HashMap<String, Integer> categoriesMap = new HashMap<>();
            for (int j = 0; j < categories; j++) {
                String[] inputArr = sc.nextLine().split(" ");
                categoriesMap.put(inputArr[0], Integer.valueOf(inputArr[1]));
            }
            for (int j = 0; j < transactions; j++) {
                String[] inputArr = sc.nextLine().split(" ");
                String key = inputArr[0];
                char operation = inputArr[1].charAt(0);
                int num = Integer.parseInt(inputArr[2]);
                if (operation == '+') {
                    categoriesMap.put(key, num + categoriesMap.get(key));
                    answer += "YES";
                } else if (operation == '-') {
                    if (categoriesMap.get(key) - num < 0) {
                        answer += "NO";
                    } else {
                        categoriesMap.put(key, categoriesMap.get(key) - num);
                        answer += "YES";
                    }
                } else {
                    answer += "IDK WHAT TO SAY BRO";
                }
                if (j + 1 != transactions) {
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
