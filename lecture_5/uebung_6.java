package lecture_5;
import java.util.Scanner;
public class uebung_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eingabe;
        int sum = 0;
        do{
            eingabe = input.nextInt();
            sum += +eingabe;
        }
        while(eingabe !=0);

        System.out.println("Summe:"+sum);
    }

}
