import java.util.Scanner;

public class BishopMove {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] boardSize = sc.nextLine().split(",");
            int totalRows = Integer.parseInt(boardSize[0] + 1);
            int totalCols = Integer.parseInt(boardSize[1] + 1);

            String[] bishopStart = sc.nextLine().split(",");
            int bishopStartRow = Integer.parseInt(bishopStart[0]);
            int bishopStartCol = Integer.parseInt(bishopStart[1]);

            String[] bishopEnd = sc.nextLine().split(",");
            int bishopEndRow = Integer.parseInt(bishopEnd[0]);
            int bishopEndCol = Integer.parseInt(bishopEnd[1]);

            boolean[][] isBlackSquareArr = new boolean[totalRows][totalCols];
            boolean rowStartsBlack = false;
            boolean isSuareBlack;
            for (int row = 1; row < totalRows; row++) {
                rowStartsBlack = !rowStartsBlack;
                isSuareBlack = !rowStartsBlack;
                for (int col = 1; col < totalCols; col++) {
                    isSuareBlack = !isSuareBlack;
                    isBlackSquareArr[row][col] = isSuareBlack;
                }
            }

            boolean startIsBlack = isBlackSquareArr[bishopStartRow][bishopStartCol];
            boolean endIsBlack = isBlackSquareArr[bishopEndRow][bishopEndCol];
            if (startIsBlack == endIsBlack) {
                answer += "Yes";
            } else {
                answer += "No";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
