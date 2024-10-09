package altklausur;

public class aufgabe_2 {
    public static void main(String[] args) {

        wandleUmInCents("101,99");

    }

    public static char[] wandleUmInCents(String preis){
        preis = preis.replace(",","");
        char[] preisArray = preis.toCharArray();
        int laenge = 0;

        for(int i= 0; preisArray[i]<49 && i<preisArray.length;i++){
            laenge++;
        }
        char[] newPreisArray = new char[preisArray.length-laenge];
        for(int i = 0; i< newPreisArray.length;i++){
            newPreisArray[i]=preisArray[i+laenge];
        }
        System.out.println(String.valueOf(newPreisArray));
        return preisArray;
    }
}
