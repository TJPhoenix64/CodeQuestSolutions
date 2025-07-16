import java.util.ArrayList;
import java.util.Scanner;

//DONE!!
public class Problem_14 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        int lines;
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            lines = sc.nextInt();
            sc.nextLine();
            String text = "";
            for (int j = 0; j < lines; j++) {
                text += sc.nextLine();
            }
            String[] sentenceArr = text.split("(?<=\\.)|(?<=\\?)|(?<=!)");
            String keyword = sc.nextLine();
            for (String sentences : sentenceArr) {
                int numKeywords = 0;
                if (sentences.toLowerCase().contains(keyword.toLowerCase())) {
                    if (sentences.substring(0, 1).equals(" ")) {
                        sentences = sentences.substring(1);
                    }
                    String[] wordArr = sentences.split("\\s+");
                    // System.out.println(Arrays.toString(wordArr));
                    ArrayList<Integer> keyIdxList = new ArrayList<>();
                    for (int l = 0; l < wordArr.length; l++) {
                        if (wordArr[l].toLowerCase().contains(keyword.toLowerCase())) {
                            numKeywords++;
                            keyIdxList.add(l);
                        }
                    }
                    int usedKeywords = 0;

                    for (int indexes : keyIdxList) {
                        usedKeywords++;
                        // System.out.println(keyIdxList);
                        if (indexes > 3) {
                            answer += "...";
                        }
                        // System.out.println(Arrays.toString(wordArr));
                        System.out.println(indexes);
                        for (int k = 0; k < wordArr.length; k++) {
                            if (indexes == k) {
                                answer += "*" + wordArr[k] + "* ";
                            } else if (indexes - 3 <= k && indexes + 5 > k) {
                                // System.out.println("This code is being run2 " + k);
                                answer += wordArr[k] + " ";
                            } else if (indexes + 5 == k) {
                                answer += wordArr[k];
                                if (k + 1 != wordArr.length) {
                                    answer += "...";
                                }
                            }
                        }
                        // System.out.println("UsedKeywords: " + usedKeywords + " NumKeywords: " +
                        // numKeywords);
                        // System.out.println("I: " + i + " numCases: " + numCases);
                        if (usedKeywords < numKeywords || i <= numCases - 1) {
                            answer += "\n";
                        }
                    }

                    // System.out.println(keyIdxList);
                }
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
