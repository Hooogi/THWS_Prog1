package lecture_3;
import java.util.Scanner;
public class uebung_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boolInt;
        char bool1 = input.next().charAt(0);
        char bool2 = input.next().charAt(0);

        if(bool1 == 'f' && bool2 == 'f'){
            boolInt = 0;
        }
        else if (bool1 == 'f' && bool2 == 't') {
            boolInt = 1;
        }
        else if (bool1 == 't' && bool2 == 'f') {
            boolInt = 2;
        }
        else if (bool1 == 't' && bool2 == 't') {
            boolInt = 3;
        }
        else {
            System.out.println("Ungültige Eingabe");
        }
    }

}
