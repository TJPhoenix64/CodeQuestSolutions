import java.util.Scanner;

public class ImBoard {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            int n = Integer.parseInt(sc.nextLine());
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    answer.append("#");
                    if (c + 1 != n) {
                        answer.append(" ");
                    }
                }
                if (r + 1 != n) {
                    answer.append("\n");
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