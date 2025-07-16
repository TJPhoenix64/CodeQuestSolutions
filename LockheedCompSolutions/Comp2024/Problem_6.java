import java.util.Scanner;

//DONE
public class Problem_6 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCases; i++) {
            boolean isValid = true;
            String answer = "VALID";
            String address = sc.nextLine();
            // System.out.println(address);
            String[] strArr = address.split("\\.");
            if (strArr.length != 4) {
                // System.out.println("string array has a length of: " + strArr.length);
                isValid = false;
            } else {
                int[] numArr = new int[strArr.length];
                for (int j = 0; j < numArr.length; j++) {
                    if (isValid) {
                        numArr[j] = Integer.parseInt(strArr[j]);
                        if (numArr[j] < 0 || numArr[j] > 255) {
                            isValid = false;
                        }
                    }
                }
            }
            if (!isValid) {
                answer = "INVALID";
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
