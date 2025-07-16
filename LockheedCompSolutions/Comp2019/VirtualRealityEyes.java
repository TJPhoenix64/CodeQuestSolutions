import java.util.Scanner;

public class VirtualRealityEyes {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);
            for (int r = 0; r < 20; r++) {
                for (int c = 0; c < 20; c++) {
                    if (row == r && col == c) {
                        answer.append("100");
                    } else if ((r == row - 1 || r == row + 1 || r == row)
                            && (c == col - 1 || c == col || c == col + 1)) {
                        answer.append("50");
                    } else if ((r >= row - 2 && r <= row + 2)
                            && (c >= col - 2 && c <= col + 2)) {
                        answer.append("25");
                    } else {
                        answer.append("10");
                    }
                    if (c != 19) {
                        answer.append(" ");
                    }
                }
                if (r != 19) {
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
