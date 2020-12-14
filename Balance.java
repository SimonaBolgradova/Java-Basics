import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalMoney =0;

        while (!input.equals("NoMoreMoney")){
            double currentNum = Double.parseDouble(input);

            if (currentNum<0){
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", currentNum);
            totalMoney+=currentNum;
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
