import static java.lang.Character.isLetter;
import static java.lang.Character.toLowerCase;
import java.util.Scanner;

public class MilitaryAlphabet {
    @SuppressWarnings("ConvertToTryWithResources")

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            int numLines = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < numLines; j++) {
                String input = sc.nextLine();
                for (int k = 0; k < input.length(); k++) {
                    char letter = input.charAt(k);
                    if (letter == ' ') {
                        answer.append(" ");
                    } else if (isLetter(letter)) {
                        letter = toLowerCase(letter);
                        switch (letter) {
                            case 'a' -> answer.append("Alpha");
                            case 'b' -> answer.append("Bravo");
                            case 'c' -> answer.append("Charlie");
                            case 'd' -> answer.append("Delta");
                            case 'e' -> answer.append("Echo");
                            case 'f' -> answer.append("Foxtrot");
                            case 'g' -> answer.append("Golf");
                            case 'h' -> answer.append("Hotel");
                            case 'i' -> answer.append("India");
                            case 'j' -> answer.append("Juliett");
                            case 'k' -> answer.append("Kilo");
                            case 'l' -> answer.append("Lima");
                            case 'm' -> answer.append("Mike");
                            case 'n' -> answer.append("November");
                            case 'o' -> answer.append("Oscar");
                            case 'p' -> answer.append("Papa");
                            case 'q' -> answer.append("Quebec");
                            case 'r' -> answer.append("Romeo");
                            case 's' -> answer.append("Sierra");
                            case 't' -> answer.append("Tango");
                            case 'u' -> answer.append("Uniform");
                            case 'v' -> answer.append("Victor");
                            case 'w' -> answer.append("Whiskey");
                            case 'x' -> answer.append("Xray");
                            case 'y' -> answer.append("Yankee");
                            case 'z' -> answer.append("Zulu");
                        }
                        if (k + 1 != input.length()) {
                            if (k + 1 < input.length() && isLetter(input.charAt(k + 1))) {
                                answer.append("-");
                            } else {
                                // answer += "*" + (k - input.indexOf(' '));
                            }
                        }
                    }

                }
                if (j + 1 != numLines) {
                    answer.append("\n");
                }
            }
            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        String testAnswer = "Charlie-Oscar-Delta-Echo Quebec-Uniform-Echo-Sierra-Tango\nRomeo-Oscar-Charlie-Kilo-Sierra\nLima-Oscar-Charlie-Kilo-Hotel-Echo-Echo-Delta";
        String s1 = testAnswer;
        String s2 = answer.toString().trim();

        for (int l = 0; l < Math.min(s1.length(), s2.length()); l++) {
            if (s1.charAt(l) != s2.charAt(l)) {
                // System.out.println("Difference at index " + l + ": " + s1.charAt(l) + " vs "
                // + s2.charAt(l));
            }
        }
        // System.out.println(escapeSpecialChars(answer.substring(50, 60)));
        // System.out.println(escapeSpecialChars(testAnswer.substring(50, 60)));
        System.out.println(answer);
        // System.out.println(testAnswer);
        sc.close();
    }
}
