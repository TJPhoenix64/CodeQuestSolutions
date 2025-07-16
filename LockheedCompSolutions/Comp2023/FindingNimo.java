import java.util.Scanner;

public class FindingNimo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            for (int idx = 0; idx < input.length; idx++) {
                String word = input[idx];
                if (word.equals("Nimo")) {
                    answer += (idx + 1);
                    idx = input.length;
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