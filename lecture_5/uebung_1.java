package lecture_5;

public class uebung_1 {
    public static void main(String[] args) {
        final double grenzwert = 10e-6;
        double ergebnis;
        double k =1;
        do{
            ergebnis = 6*(1/(Math.pow(k,2)));
            System.out.println(ergebnis);
            k++;
        }
        while(ergebnis - grenzwert >0e-6);
    }
}

//c: Vor der Reihe: Ergebnis des Bruches 1/k² wird multipliziert. In der Reihe: 6/k²