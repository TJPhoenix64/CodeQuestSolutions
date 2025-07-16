import java.util.Scanner;

public class Monogram {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int num = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < num; j++) {
                String[] input = sc.nextLine().split(" ");
                char first = Character.toUpperCase(input[0].charAt(0));
                char second = Character.toUpperCase(input[2].charAt(0));
                char third = Character.toUpperCase(input[1].charAt(0));
                answer += String.valueOf(first) + String.valueOf(second) + String.valueOf(third);

                if (j + 1 != num) {
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
