import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int hour = Integer.parseInt (scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int minP =  min +15;

        if (minP >= 45 ){
            System.out.println(hour + 1);

        }else{
            System.out.println (hour);
        }

        System.out.printf("%d:%02", hour, minP);



    }
}
