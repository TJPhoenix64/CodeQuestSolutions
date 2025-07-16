import java.util.Scanner;

public class Problem_15 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String xyString = sc.nextLine();
            String[] xyArr = xyString.split(",");
            int rows = Integer.parseInt(xyArr[0]);
            String stock = sc.nextLine();
            String[] stockStrArr = stock.split(",");
            int panels = Integer.parseInt(stockStrArr[0]);
            int oneFrames = Integer.parseInt(stockStrArr[1]);
            int quarterFrames = Integer.parseInt(stockStrArr[2]);
            int neededPanels = 0;
            int neededOneFrames = 0;
            int neededQuarterFrames = 0;
            for (int r = 0; r < rows; r++) {
                String input = sc.nextLine();
                String[] inputStrArr = input.split(",");
                // System.out.println(Arrays.toString(inputStrArr));
                for (String nums : inputStrArr) {
                    double num = Double.parseDouble(nums);
                    if (num != 0) {
                        neededPanels++;
                    }
                    int ones = (int) (num / 1);
                    int quarters = (int) ((num % 1) / 0.25);
                    neededOneFrames += ones;
                    neededQuarterFrames += quarters;
                }

            }
            int extraPanels = panels - neededPanels;
            int usedPanels = panels;
            if (neededPanels < panels) {
                usedPanels -= extraPanels;
            }
            int extraOneFrames = oneFrames - neededOneFrames;
            int usedOneFrames = oneFrames;

            int extraQuarterFrames = quarterFrames - neededQuarterFrames;
            int usedQuarterFrames = quarterFrames;
            int onesHelperFrames = 0;
            if (neededQuarterFrames < quarterFrames) {
                if (extraOneFrames < 0) {
                    onesHelperFrames += neededOneFrames / 4;

                    usedOneFrames += onesHelperFrames;
                }
                usedQuarterFrames -= extraQuarterFrames;

            }
            if (neededOneFrames < oneFrames) {
                usedOneFrames -= extraOneFrames;
            }

            answer += usedPanels + " (" + extraPanels + "),";
            answer += usedOneFrames + " (" + extraOneFrames + "),";
            answer += usedQuarterFrames + " (" + extraQuarterFrames + ")";
            if (i + 1 != numCases) {
                answer += "\n";
            }

        }
        System.out.println(answer);
        sc.close();
    }
}
