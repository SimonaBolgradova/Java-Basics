import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());

        double secs = distance * time;
        double d = distance/15 * 12.5;
        double all = secs + d;

        double lack = all - record;
        
        if (record < all){
            System.out.printf("No, he failed! He was %.2f seconds slower.", lack);
        }else{
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", all);
        }
    }
}
