import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        String stop = scan.nextLine();

        while (!stop.equals("Stop")){
            int number = Integer.parseInt(stop);
            if (number>maxNumber){
                maxNumber = number;
            }
            stop = scan.nextLine();
        }
        System.out.println(maxNumber);
    }
}
