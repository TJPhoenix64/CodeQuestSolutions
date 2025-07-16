import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Fuel {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            int fuelCapacity = Integer.parseInt(input[0]);
            int numTanks = Integer.parseInt(input[1]);
            String tankInput = sc.nextLine();
            HashMap<String, String> inputValueMap = new HashMap<>();

            String[] tanksInput = tankInput.split(" ");

            for (String elem : tanksInput) {
                inputValueMap.put(elem, "");
            }
            ArrayList<Integer> tanksArr = new ArrayList<>();
            for (int j = 0; j < numTanks; j++) {
                tanksArr.add(Integer.valueOf(tanksInput[j]));
            }

            Collections.sort(tanksArr);
            double currentFuel = fuelCapacity;
            int fullTanks = 0;
            for (int tankIdx = 0; tankIdx < tanksArr.size(); tankIdx++) {
                double amountPerTank = currentFuel / (tanksArr.size() - fullTanks);
                int tankValue = tanksArr.get(tankIdx);
                if (amountPerTank > tankValue) {
                    currentFuel -= tankValue;
                    inputValueMap.put(tankValue + "", tankValue + "");
                    fullTanks++;
                } else {
                    int numRemainingTanks = tanksArr.size() - fullTanks;
                    if (currentFuel % numRemainingTanks == 0) {
                        inputValueMap.put(tankValue + "", (int) (currentFuel / numRemainingTanks) + "");
                    } else {
                        for (int modNum = numRemainingTanks; modNum > 1; modNum--) {
                            if (currentFuel % modNum == 0 && numRemainingTanks % modNum == 0) {
                                currentFuel /= modNum;
                                numRemainingTanks /= modNum;
                                break;
                            }
                        }
                        inputValueMap.put(tankValue + "", (int) currentFuel + "/" + numRemainingTanks);
                    }
                }
                // System.out.println(inputValueMap);
                // System.out.println(fullTanks);
            }
            for (String tank : tanksInput) {
                answer.append(inputValueMap.get(tank)).append(" ");
            }

            if (i + 1 != numCases) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
