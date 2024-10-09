package altklausur;
import java.util.Scanner;
import altklausur.spaceinvaders_2;
public class main_spaceinvaders {
    public static void main(String[] args) {
        spaceinvaders_2 spiel = new spaceinvaders_2();
        Scanner input = new Scanner(System.in);
        char c;
        System.out.println(spiel);
        do{
            c = input.nextLine().charAt(0);
            spiel.bewege(c);
            System.out.println(spiel.toString());
        }
        while(c != 'x');
    }
}
