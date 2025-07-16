import java.util.Scanner;

public class Zodiac {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int year = Integer.parseInt(sc.nextLine());
            answer += year + " ";
            if (year % 2 == 0) {
                answer += "Yang ";
            } else {
                answer += "Yin ";
            }
            year -= 4;
            int elementNum = ((year % 10) / 2);
            String[] elemArr = { "Wood", "Fire", "Earth", "Metal", "Water" };
            answer += elemArr[elementNum] + " ";

            int animalNum = year % 12;
            String[] animalArr = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey",
                    "Rooster", "Dog", "Pig" };
            answer += animalArr[animalNum];

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
