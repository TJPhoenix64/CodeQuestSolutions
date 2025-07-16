import java.util.Scanner;

public class IllegalInput {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            boolean isValid = true;
            if (input.contains("&& sudo")) {
                isValid = false;
            } else if (input.contains("&& su -")) {
                isValid = false;
            } else if (input.contains(";;")) {
                isValid = false;
            } else if (input.contains("%s")) {
                isValid = false;
            } else if (input.contains("%x")) {
                isValid = false;
            } else if (input.contains("%n")) {
                isValid = false;
            } else if (input.toLowerCase().contains("<script")) {
                isValid = false;
            } else if (input.toLowerCase().contains("' OR 1=1")) {
                isValid = false;
            } else if (input.contains("'; ") && input.contains(" --") && input.indexOf("'; ") < input.indexOf(" --")) {
                isValid = false;
            } else if (input.contains("${") && input.contains("}") && input.indexOf("${") < input.indexOf("}")) {
                isValid = false;
            } else if (input.contains("$(") && input.contains(")") && input.indexOf("$(") < input.indexOf(")")) {
                isValid = false;
            }

            if (isValid) {
                answer += input;
            } else {
                answer += "REJECTED";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}