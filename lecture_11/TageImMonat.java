package lecture_11;

import java.util.Scanner;
public class TageImMonat
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean errorOccured;
        do{
            try{
                String monat = input.nextLine();
                System.out.println(tageImMonat(monat));
                errorOccured=false;
            }
            catch(RuntimeException x){
                errorOccured=true;
            }
        }
        while(errorOccured);
    }
    public static int tageImMonat(String monat)
    {
        int tage = switch(monat)
        {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                    "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }
}