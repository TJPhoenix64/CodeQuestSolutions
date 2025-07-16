import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Assemble {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            String[] input = sc.nextLine().split(" ");
            HashMap<Character, Integer> agentHashMap = new HashMap<>();
            ArrayList<ArrayList<Character>> finalAnswerList = new ArrayList<>();
            ArrayList<Character> currentBestArrayList = new ArrayList<>();
            for (String word : input) {
                String[] wordArr = word.split("=");
                agentHashMap.put(wordArr[0].charAt(0), Integer.valueOf(wordArr[1]));
            }
            int maxAgentsInRange = 0;
            for (Character anchorAgent : agentHashMap.keySet()) {
                int j = agentHashMap.get(anchorAgent);
                int agentsInRange = 0;
                int upper = j + 10;
                for (Character agents : agentHashMap.keySet()) {
                    if (agentHashMap.get(agents) >= j && agentHashMap.get(agents) <= upper) {
                        agentsInRange++;
                        currentBestArrayList.add(agents); // System.out.println("Key: " + agents);
                    }
                }
                if (agentsInRange > maxAgentsInRange) {
                    maxAgentsInRange = agentsInRange;
                    finalAnswerList.removeAll(finalAnswerList);
                    finalAnswerList.add(currentBestArrayList);
                    System.out.println(finalAnswerList + " " + anchorAgent);
                } else if (agentsInRange == maxAgentsInRange) {
                    finalAnswerList.add(currentBestArrayList);
                    System.out.println(currentBestArrayList + "This is being printed");
                }
            }

            System.out.println(finalAnswerList);

            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
