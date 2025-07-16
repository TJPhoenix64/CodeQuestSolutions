import java.util.HashMap;
import java.util.Scanner;

//DONE!!!!
public class Problem_11 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            if (i != 0) {
                answer += "\n";
            }
            String input = sc.nextLine();
            String[] strArr = input.split(" ");
            int ogArrLength = strArr.length;
            while (ogArrLength > 0) {
                HashMap<Integer, String> tempMap = new HashMap<>();
                int strIndex = -1;
                for (int h = 0; h < strArr.length; h++) {
                    if (!"".equals(strArr[h])) {
                        tempMap.put(h, strArr[h]);
                    }
                }
                while (tempMap.size() > 1) {
                    int maxNum = 0;
                    strIndex++;
                    // System.out.println("String Index: " + strIndex);
                    // find max num
                    for (int j = 0; j < strArr.length; j++) {
                        int currentChar;
                        if (tempMap.containsKey(j)) {
                            if (strArr[j].length() > strIndex) {
                                currentChar = Integer.parseInt(strArr[j].substring(strIndex, strIndex + 1));
                            } else {
                                currentChar = Integer.parseInt(strArr[j].substring(strIndex - 1, strIndex));
                            }
                            // System.out.println("currentChar: " + currentChar);
                            if (currentChar > maxNum) {
                                maxNum = currentChar;
                            }
                        }
                    }
                    // delete all ones that are not the best
                    for (int idx = 0; idx < strArr.length; idx++) {
                        int currentChar;
                        if (tempMap.containsKey(idx)) {
                            if (strArr[idx].length() > strIndex) {
                                currentChar = Integer.parseInt(strArr[idx].substring(strIndex, strIndex + 1));
                            } else {
                                currentChar = Integer.parseInt(strArr[idx].substring(strIndex - 1, strIndex));
                            }
                            if (currentChar != maxNum) {
                                tempMap.remove(idx);
                            }
                        }
                    }
                    // System.out.println(tempMap);
                }
                for (Integer keys : tempMap.keySet()) {
                    // System.out.println(tempMap.get(keys));
                    answer += tempMap.get(keys);
                    strArr[keys] = "";
                }
                ogArrLength--;
                /*
                 * while(ogArr contains > 0 nums){
                 * while(tempMap.size > 0){
                 * make tempmap the remaining things in strArr
                 * if they are not as good as the best current num, delete them
                 * }
                 * }
                 */
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
