package buch_heinzl;
import java.util.Scanner;

public class ISBN_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ISBN eingeben: ");
        String isbn = input.nextLine();

        ISBN herrDerRinge = new ISBN(isbn);
    }
}
