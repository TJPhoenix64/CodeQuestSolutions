import java.util.Scanner;

public class Data {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < numCases; i++) {
            int numLines = Integer.parseInt(sc.nextLine());
            boolean hasAnswer = false;
            for (int j = 0; j < numLines; j++) {
                String inpu = sc.nextLine();

                String[] input = inpu.split("\\s+");

                String name = input[0];

                int num = Integer.parseInt(input[1]);

                if (name.endsWith(".lmco.com")) {
                    continue;
                }
                if (num > 1000) {
                    if (hasAnswer) {
                        answer.append("\n");
                    }
                    answer.append(inpu);
                    hasAnswer = true;
                }
            }
            if (i + 1 != numCases && hasAnswer) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
