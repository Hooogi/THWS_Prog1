package lecture_6;
import java.util.Scanner;

public class uebung_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben sie bitte eine Zahl ein: ");
        int x = input.nextInt();
        System.out.println(fakultaet(x));
    }

    public static int fakultaet(int x){
        if(x==0){
            return 1;
        }
        int ergebnis = x * fakultaet(x-1);

        return ergebnis;
    }
}
