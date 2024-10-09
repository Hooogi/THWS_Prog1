package lecture_6;
import java.util.Scanner;
public class uebung_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vorname: ");
        String firstName = input.nextLine();
        System.out.print("Nachname: ");
        String lastName = input.nextLine();
        System.out.print("Matrikelnummer: ");
        int matrikelnummer = input.nextInt();

        System.out.println(formatString(firstName,lastName,matrikelnummer));
    }

    public static String formatString(String firstName, String lastName, int matrikelnr){
        String formattedString;
        String formatted_firstName = lowerCaseFirstLetter(firstName);
        String formatted_lastName = lowerCaseFirstLetter(lastName);
        formattedString = firstName+" "+lastName + "("+matrikelnr+"):"+formatted_firstName+"."+formatted_lastName+"@study.thws.de";
        return formattedString;
    }

    public static String lowerCaseFirstLetter(String Name){
        String string ="";
        char[] letterArray = Name.toCharArray();
        letterArray[0]+=32;
        for(char c:letterArray){
            string+=c;
        }
        return string;
    }
}
