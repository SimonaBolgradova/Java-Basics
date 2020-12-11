import java.util.Scanner;

public class TimeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inheritedMoney = Integer.parseInt(scan.nextLine());
        int yearOfLive = Integer.parseInt(scan.nextLine());
        int money = 0;
        int old = yearOfLive % 10 +18;

        for (int i= 1800; i <=yearOfLive; i++){
             if (yearOfLive % 2==0){
             money = 12000;
         } if (yearOfLive % 2 ==1){
             money =12000 + 50 * old;
         }

         }

         int leftMoney = inheritedMoney - money;
         int neededMoney= money - inheritedMoney;

         if (inheritedMoney> money){
             System.out.printf("Yes! He will live a carefree life and will have %.2d dollars left.", leftMoney);
         }else{
             System.out.printf("He will need %.2d dollars to survive.",neededMoney );
         }

    }
}
