import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hex {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            boolean isValid = true;
            String[] inputArr = sc.nextLine().split(" ");
            String[] specialStrings = { "2E", "2C", "5B", "5D", "3A", "20" };
            ArrayList<String> list = new ArrayList<>(Arrays.asList(specialStrings));
            for (String elem : inputArr) {
                if (!list.contains(elem)) {
                    int decimal;
                    try {
                        decimal = Integer.parseInt(elem, 16);
                    } catch (NumberFormatException e) {
                        isValid = false;
                        break;
                    }

                    if ((decimal >= 48 && decimal <= 57) || // 0-9
                            (decimal >= 65 && decimal <= 90) || // A-Z
                            (decimal >= 97 && decimal <= 122)) { // a-z
                        // Valid character
                    } else {
                        isValid = false;
                    }
                }
            }
            if (isValid) {
                answer += "VALID";
            } else {
                answer += "INVALID";
            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}