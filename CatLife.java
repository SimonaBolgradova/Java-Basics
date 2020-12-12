import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scan.nextLine());

        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;
        int countFourth = 0;
        int countFifth = 0;

        for (int i = 0; i<countNumbers; i ++ ){
            int value = Integer.parseInt(scan.nextLine());
            if (value< 200){
                countFirst+=1;
            }else if (value >= 200 && value <=399){
                countSecond+=1;
            }else if (value >=400 && value<= 599){
                countThird+=1;
            }else if (value >= 600 && value <=799){
                countFourth+=1;
            }else if (value >= 800){
                countFifth+=1;
            }
        }

        double percentFirst = countFirst* 1.0 / countNumbers *100;
        double percentSecond =  countSecond*1.0 / countNumbers * 100;
        double percentThird= countThird*1.0 /countNumbers *100;
        double percentFourth =  countFourth*1.0 /countNumbers *100;
        double percentFifth = countFifth*1.0/ countNumbers *100;

        System.out.printf("%.2f%%%n",percentFirst);
        System.out.printf("%.2f%%%n",percentSecond);
        System.out.printf("%.2f%%%n",percentThird);
        System.out.printf("%.2f%%%n",percentFourth);
        System.out.printf("%.2f%%%n",percentFifth);

    }
}
