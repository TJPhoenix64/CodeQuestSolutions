import java.util.Scanner;

public class Robot {

    public static int normalizeAngle(int degree) {
        if (degree >= 360) {
            while (degree >= 360) {
                degree -= 360;
            }
        }
        if (degree < 0) {
            while (degree < 0) {
                degree += 360;
            }
        }
        return degree;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            String dirStr = input[2];
            String instructions = input[3];
            int dir;
            if (dirStr.equals("N")) {
                dir = 90;
            } else if (dirStr.equals("E")) {
                dir = 0;
            } else if (dirStr.equals("S")) {
                dir = 270;
            } else {
                dir = 180;
            }

            for (int j = 0; j < instructions.length(); j++) {
                char letter = instructions.charAt(j);
                if (letter == 'R') {
                    dir -= 90;
                    dir = normalizeAngle(dir);
                } else if (letter == 'L') {
                    dir += 90;
                    dir = normalizeAngle(dir);
                } else {
                    if (dir == 90) {
                        y++;
                    } else if (dir == 0) {
                        x++;
                    } else if (dir == 270) {
                        y--;
                    } else if (dir == 180) {
                        x--;
                    }
                }
            }
            answer += x + " " + y + " ";
            if (dir == 90) {
                answer += "N";
            } else if (dir == 0) {
                answer += "E";
            } else if (dir == 180) {
                answer += "W";
            } else {
                answer += "S";
            }
            // answer += " " + dir;

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
