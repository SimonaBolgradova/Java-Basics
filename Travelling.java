import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        double budget = Double.parseDouble(scan.nextLine());
        double enough =0;
        while (budget>=enough){
            double currentSavings= Double.parseDouble(scan.nextLine());
            enough +=currentSavings;
            while (!destination.equals("End")) {
                currentSavings = Double.parseDouble(scan.nextLine());
                enough+=currentSavings;
            }
            if (budget>=enough){
                System.out.printf("Going to %s", destination);
                break;
            }
        }
    }
}
