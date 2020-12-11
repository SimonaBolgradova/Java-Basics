import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double buget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt (scan.nextLine());
        double priceClothing = Double.parseDouble(scan.nextLine());

        double decorPrice = buget*0.1;

        double clothing = extras* priceClothing;

        if (extras >= 150){
            priceClothing= priceClothing- priceClothing*0.1;
        }

        double moneyForDecAndCloth = clothing + decorPrice;
        double balance = buget - moneyForDecAndCloth;

        double lackOfMoney= moneyForDecAndCloth - buget;

        if (moneyForDecAndCloth > buget){
            System.out.println("Not enough money!");
            System.out.printf( "Wingard needs %.2f leva more.", lackOfMoney);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", balance);
        }


    }
}
