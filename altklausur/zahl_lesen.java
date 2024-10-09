package altklausur;
import java.util.Scanner;
public class zahl_lesen {
    public static void main(String[] args) {
        System.out.println(liesZahl());
    }

    public static int liesZahl(){
        Scanner input = new Scanner(System.in);
        boolean isInteger;
        String inputString;

        do{
            isInteger = true;
            System.out.print("Eingabe: ");
            inputString = input.nextLine();
            char[] inputArray = inputString.toCharArray();

            for(char c: inputArray){
                if(c<48 || c>57){
                    isInteger = false;
                }
            }
            if(!isInteger){
                System.out.println("Ungültige Eingabe! Geben sie bitte eine Ganzzahl ein: ");
            }
        }
        while(!isInteger);

        return Integer.valueOf(inputString);
    }
}
