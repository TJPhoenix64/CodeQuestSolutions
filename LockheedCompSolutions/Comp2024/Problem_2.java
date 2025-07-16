import java.util.Scanner;

//DONE
public class Problem_2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            int numPoints = sc.nextInt();
            sc.nextLine();
            int xCordRobot = sc.nextInt();
            int yCordRobot = sc.nextInt();
            int minDistance = sc.nextInt();
            // System.out.println(xCordRobot + ", " + yCordRobot + ", " + minDistance);

            for (int j = 0; j < numPoints; j++) {
                int xCord = sc.nextInt();
                int yCord = sc.nextInt();
                double distance = Math.sqrt(Math.pow(xCordRobot - xCord, 2) + Math.pow(yCordRobot - yCord, 2));
                String answer = "(" + xCord + "," + yCord + ") ";
                if (distance < minDistance) {
                    answer += "DANGER";
                } else {
                    answer += "SAFE";
                }
                System.out.println(answer);
            }
        }
        sc.close();
    }
}
