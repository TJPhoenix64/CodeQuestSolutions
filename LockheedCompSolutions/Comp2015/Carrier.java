import java.util.Scanner;

public class Carrier {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numPlanes = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < numPlanes; j++) {
                String name = sc.nextLine();
                answer += name + ", ";
                String[] planeCords = sc.nextLine().split(",");
                double planeX = Double.parseDouble(planeCords[0]);
                double planeY = Double.parseDouble(planeCords[1]);

                String[] carrierStart = sc.nextLine().split(",");
                int carrier1X = Integer.parseInt(carrierStart[0]);
                int carrier1Y = Integer.parseInt(carrierStart[1]);

                String[] carrierEnd = sc.nextLine().split(",");
                int carrier2X = Integer.parseInt(carrierEnd[0]);
                int carrier2Y = Integer.parseInt(carrierEnd[1]);

                double slope1 = (carrier1Y - planeY) / (carrier1X - planeX);
                double slope2 = (carrier2Y - planeY) / (carrier2X - planeX);

                if (slope1 <= -0.8 && slope1 >= -1.6 && slope2 <= -0.8 && slope2 >= -1.6) {
                    answer += "Clear To Land!";
                } else {
                    answer += "Abort Landing!";
                }
                if (j + 1 != numPlanes) {
                    answer += "\n";
                }
            }

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
