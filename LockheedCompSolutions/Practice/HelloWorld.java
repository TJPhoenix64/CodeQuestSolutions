
import java.util.Scanner;

public class HelloWorld {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numLines; i++) {
            String input = sc.nextLine();
            answer += input;
            if (i + 1 != numLines) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
