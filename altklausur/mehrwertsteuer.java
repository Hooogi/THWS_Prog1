package altklausur;

public class mehrwertsteuer {
    public static void main(String[] args) {
        System.out.println(berechneNettopreis(1.07, 0.07));
    }

    public static double berechneNettopreis(double Brutto, double mwst){
         mwst = mwst +1;

         double netto = Brutto / mwst;

         return netto;
    }
}
