import java.util.ArrayList;
import java.util.Scanner;

public class Colors {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        String[] primaries = { "yellow", "red", "blue" };
        String[] RedYellow = { "red-orange", "orange", "yellow-orange" };
        String[] RedBlue = { "red-violet", "violet", "blue-violet" };
        String[] BlueYellow = { "yellow-green", "green", "blue-green" };
        ArrayList<String[]> colorArrayList = new ArrayList<>();
        colorArrayList.add(primaries);
        colorArrayList.add(RedYellow);
        colorArrayList.add(RedBlue);
        colorArrayList.add(BlueYellow);

        for (int i = 0; i < numCases; i++) {
            String input = sc.nextLine();
            int index = 10;
            for (String[] lists : colorArrayList) {
                for (String elem : lists) {
                    if (elem.equals(input)) {
                        index = colorArrayList.indexOf(lists);
                    }
                }
            }
            if (index == 10) {
                answer += "IDk what to say";
            }
            if (index == 0) {
                answer += "No colors need to be mixed to make " + input + ".";
            }
            if (index == 1) {
                answer += "In order to make " + input + ", red and yellow must be mixed.";
            }
            if (index == 2) {
                answer += "In order to make " + input + ", blue and red must be mixed.";
            }
            if (index == 3) {
                answer += "In order to make " + input + ", blue and yellow must be mixed.";
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
