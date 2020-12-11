import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int buget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int countFishermans = Integer.parseInt(scan.nextLine());

        double prise = 0.0;
        double bonus = 0.0;

        switch (season){
            case "Spring":
                prise = 3000;
                bonus = 0.05;
                break;
                case "Summer":
                    bonus = 0.05;
                    prise = 4200;
                    break;
            case "Autumn":
                prise = 4200;
                break;
            case "Winter":
                prise= 2600;
                bonus = 0.05;
                break;
        }

        if (countFishermans <= 6){
            prise = prise - prise * 0.1;
        } else if (countFishermans <=11){
            prise = prise - prise * 1.5;
        } else {
            prise -= prise * 2.5;
        }
        if (countFishermans % 2 == 0){
            prise = prise - prise* bonus;
        }

        if (buget>prise){
            double enough= buget -prise;
            System.out.printf("Yes! You have %.2f leva left.", enough);
        }else {
            double need =  prise - buget;
            System.out.printf("Not enough money! You need %.2f leva.", need);
        }
    }
}
