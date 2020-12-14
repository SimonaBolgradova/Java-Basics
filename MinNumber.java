import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seaExcursion = Integer.parseInt(scan.nextLine());
        int mountainExcursion = Integer.parseInt(scan.nextLine());
        int totalPrice = 0;
        int countSea = 0;
        int countMountain = 0;
        String command = scan.nextLine();

        while (!command.equals("Stop")) {

            if (command.equals("sea")) {
                if (countSea==seaExcursion){
                    totalPrice+=0;
                }else {
                    totalPrice += 680;
                    countSea++;
                }
            }else if (command.equals("mountain")){
                if (countMountain==mountainExcursion){
                    totalPrice+=0;
                }else {
                    totalPrice += 499;
                    countMountain++;
                }
            }
            if ( countMountain==mountainExcursion && countSea==seaExcursion){
                break;
            }
            command = scan.nextLine();
        }
        if (command.equals("Stop")) {

            System.out.printf("Profit: %d leva.", totalPrice);
        }else {
            System.out.printf("Good job! Everything is sold.%n" +
                    "Profit: %d leva.%n", totalPrice);
        }

    }
}
