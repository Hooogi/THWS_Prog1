package lecture_3;
import java.util.Scanner;

public class uebung_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        System.out.println(istSchaltjahr(year));

    }
    public static boolean istSchaltjahr(int year){
        boolean schaltjahr = false;

        if(year % 4 == 0 && !(year%100==0)){
            schaltjahr = true;
        }
        else if(year%100==0 && year%400==0){
            schaltjahr = true;
        }
        else {
            schaltjahr = false;
        }
        return schaltjahr;
    }
}
