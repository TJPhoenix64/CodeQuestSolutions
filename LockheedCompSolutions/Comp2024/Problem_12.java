
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//DONE
public class Problem_12 {

    public static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are less than key to one position ahead
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numClasses = sc.nextInt();
            int numPlayers = sc.nextInt();
            sc.nextLine();
            ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();
            HashMap<String, Integer> classMap = new HashMap<>();
            for (int j = 0; j < numClasses; j++) {
                String input = sc.nextLine();
                String[] classArr = input.split(" ");
                int indexOfFirstSpace = input.indexOf(" ");
                String Class = input.substring(0, indexOfFirstSpace);
                classMap.put(Class, j);
                ArrayList<String> classList = new ArrayList<>(Arrays.asList(classArr));
                listOfLists.add(classList);
            }
            for (int k = 0; k < numPlayers; k++) {
                String input = sc.nextLine();
                int indexOfFirstSpace = input.indexOf(" ");
                String Class = input.substring(0, indexOfFirstSpace);
                input = input.substring(indexOfFirstSpace + 1);
                String[] strArr = input.split(" ");
                int[] nums = new int[strArr.length];
                for (int idx = 0; idx < strArr.length; idx++) {
                    nums[idx] = Integer.parseInt(strArr[idx]);
                }
                insertionSortDescending(nums);
                int classIdx = classMap.get(Class);
                // System.out.println(classIdx);
                HashMap<String, Integer> attrributeMap = new HashMap<>();
                for (int j = 0; j < listOfLists.get(classIdx).size() - 1; j++) {
                    String attribute = listOfLists.get(classIdx).get(j + 1);
                    Integer amount = nums[j];
                    // System.out.println("Attribute: " + attribute + " Amount: " + amount);
                    attrributeMap.put(attribute, amount);
                }
                answer += Class + "\n";
                answer += "STR: " + attrributeMap.get("STR") + "\n";
                answer += "DEX: " + attrributeMap.get("DEX") + "\n";
                answer += "CON: " + attrributeMap.get("CON") + "\n";
                answer += "INT: " + attrributeMap.get("INT") + "\n";
                answer += "WIS: " + attrributeMap.get("WIS") + "\n";
                answer += "CHA: " + attrributeMap.get("CHA");
                if (k < numPlayers - 1) {
                    answer += "\n";
                }
            }
            System.out.println(answer);
        }

        sc.close();
    }
}
