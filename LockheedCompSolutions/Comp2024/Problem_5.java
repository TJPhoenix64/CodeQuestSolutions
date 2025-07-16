import java.util.Scanner;

//DONE
public class Problem_5 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCases; i++) {
            String answer = "";
            int numComponents = sc.nextInt() + 1;
            sc.nextLine();
            int[] ratingArr = new int[numComponents];
            int[] idArr = new int[numComponents];
            for (int j = 0; j < numComponents; j++) {
                int modelNum = sc.nextInt();
                int size = sc.nextInt();
                int weight = sc.nextInt();
                int power = sc.nextInt();
                int cost = sc.nextInt();
                sc.nextLine();
                int totalRating = size + weight + power + cost;
                ratingArr[j] = totalRating;
                idArr[j] = modelNum;
                // System.out.println(modelNum);
            }
            int ogRating = ratingArr[0];
            double contenderRating = ogRating;
            double contenderId = 0;
            for (int k = 0; k < numComponents; k++) {
                if (ratingArr[k] < contenderRating) {
                    contenderRating = ratingArr[k];
                    contenderId = idArr[k];
                }
            }
            if (contenderRating != ogRating) {
                // this is adjusted for the twenty percent, mult by 100 and rounded, //need to
                // divide by 100
                System.out.println("This line is being run_1");

                int partialAdjRating = (int) ((100 * (1.2 * contenderRating)) + 0.5);
                double fullAdjRating = partialAdjRating / 100.0;
                if (fullAdjRating < ogRating) {
                    System.out.println("This line is being run_1.IF");
                    answer += (int) contenderId + " " + (int) contenderRating;
                } else {
                    System.out.println("This line is being run_1.ELSE");
                    answer += (int) idArr[0] + " " + (int) ogRating;
                }
            } else {
                answer += (int) idArr[0] + " " + (int) ogRating;
            }
            System.out.println(answer);
        }

        sc.close();
    }
}