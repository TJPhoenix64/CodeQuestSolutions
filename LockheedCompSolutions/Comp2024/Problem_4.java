import java.util.Scanner;

//DONE
public class Problem_4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCases; i++) {
            int total = 0;
            String answer = "";
            String OnePoint = "AEILNORSTU";
            String TwoPoint = "DG";
            String ThreePoint = "BCMP";
            String FourPoint = "FHVWY";
            String FivePoint = "K";
            String EightPoint = "JX";
            String TenPoint = "QZ";
            String input = sc.nextLine();
            char[] charArr = input.toCharArray();
            int currentPointValue = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (OnePoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 1;
                } else if (TwoPoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 2;
                } else if (ThreePoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 3;
                } else if (FourPoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 4;
                } else if (FivePoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 5;
                } else if (EightPoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 8;
                } else if (TenPoint.contains(String.valueOf(input.charAt(j)))) {
                    currentPointValue = 10;
                } else {
                    // need to do the output part next
                    System.out.println("IDK what to tell you");
                }
                total += currentPointValue;
                answer += charArr[j] + "=" + currentPointValue + "\n";
            }
            answer += "TOTAL=" + total;
            System.out.println(answer);
        }
        sc.close();
    }
}
