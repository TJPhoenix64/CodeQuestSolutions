import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

//DONE
public class Problem_9 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < numCases; i++) {
            int numMaterials = sc.nextInt();
            int numScenarios = sc.nextInt();
            sc.nextLine();
            String[] materialNames = new String[numMaterials];
            Double[] materialStrength = new Double[numMaterials];
            for (int currentMaterial = 0; currentMaterial < numMaterials; currentMaterial++) {
                String materialInfo = sc.nextLine();
                int indexOfSpace = materialInfo.indexOf(" ");
                materialNames[currentMaterial] = materialInfo.substring(0, indexOfSpace);
                materialStrength[currentMaterial] = Double.valueOf(materialInfo.substring(indexOfSpace));
            }
            System.out.println(Arrays.toString(materialNames) + " " + Arrays.toString(materialStrength));
            for (int currentScenario = 0; currentScenario < numScenarios; currentScenario++) {
                String answer = "";
                String scenarioInfo = sc.nextLine();
                int indexOfSpace1 = scenarioInfo.indexOf(" ");
                int indexOfSpace2 = scenarioInfo.indexOf(" ", indexOfSpace1 + 1);
                String scenarioName = scenarioInfo.substring(0, indexOfSpace1);
                double thickness = Double.parseDouble(scenarioInfo.substring(indexOfSpace1, indexOfSpace2));
                double rate = Double.parseDouble(scenarioInfo.substring(indexOfSpace2));

                // System.out.println(scenarioName + " " + thickness + " " + rate);
                for (int materialId = 0; materialId < numMaterials; materialId++) {
                    if (materialNames[materialId].equals(scenarioName)) {
                        double shieldingRate = materialStrength[materialId] * thickness;
                        if (shieldingRate > rate) {
                            answer = "Infinity";
                        } else {
                            double numAnswer = 50.0 / (rate - shieldingRate);
                            answer = df.format(numAnswer);
                        }
                    }
                }
                System.out.println(answer);
            }

        }
        sc.close();
    }
}
