
import java.util.Scanner;

public class AnimalFarm {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int turkeys = Integer.parseInt(inputArr[0]);
            int goats = Integer.parseInt(inputArr[1]);
            int horses = Integer.parseInt(inputArr[2]);
            int legs = turkeys * 2 + goats * 4 + horses * 4;
            answer += legs;
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
