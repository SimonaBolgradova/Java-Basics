import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(scan.nextLine());
            sum += value;
            if (value > max) {
                max = value;
            }
        }
        int sumOthers =sum - max;
        if (sumOthers == max){
            System.out.println("Yes");
            System.out.println("Sum = "+ max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - sumOthers));
        }
    }
}
