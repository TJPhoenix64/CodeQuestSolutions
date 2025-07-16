import java.text.DecimalFormat;
import java.util.Scanner;

public class Easter {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        DecimalFormat df = new DecimalFormat("00");
        for (int i = 0; i < numCases; i++) {
            int y = Integer.parseInt(sc.nextLine());
            answer += y + "/";
            int a = y % 19;
            int b = y % 4;
            int c = y % 7;
            int k = y / 100;
            int p = (13 + 8 * k) / 25;
            int q = k / 4;
            int m = (15 - p + k - q) % 30;
            int n = (4 + k - q) % 7;
            int d = (19 * a + m) % 30;
            int e = (2 * b + 4 * c + 6 * d + n) % 7;
            int f = (11 * m + 11) % 30;
            int date = 22 + d + e;
            if (date <= 31) {
                answer += "03/";
            } else {
                answer += "04/";
                date -= 31;
                if (date == 25 && d == 28 && e == 6 && f < 19) {
                    date = 18;
                }
                if (date == 26 && d == 29 && e == 6) {
                    date = 19;
                }
            }
            answer += df.format(date);

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
