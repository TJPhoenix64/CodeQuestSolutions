import java.util.Scanner;

//DONE
public class Problem_3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        for (int i = 0; i < numInput; i++) {
            int num = sc.nextInt();
            int taxRate;
            if (num <= 11000) {
                taxRate = 10;
            } else if (num <= 44725) {
                taxRate = 12;
            } else if (num <= 95375) {
                taxRate = 22;
            } else if (num <= 182100) {
                taxRate = 24;
            } else if (num <= 231250) {
                taxRate = 32;
            } else if (num <= 578125) {
                taxRate = 35;
            } else {
                taxRate = 37;
            }
            double amountOwed = num * taxRate / 100;
            int answer = (int) (amountOwed + 0.5);
            System.out.println(answer);
        }
        sc.close();
    }
}
