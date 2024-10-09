package lecture_7;
import java.util.Scanner;
public class uebung_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wie viele Messwerte wollen Sie eingeben?: ");
        int arraylength = input.nextInt();
        if(arraylength == 0){
            System.out.println("Ungültige Eingabe. Beende das Programm");
            System.exit(0);
        }
        double[] messreihe = new double[arraylength];

        for(int i = 0; i<messreihe.length; i++){
            System.out.print((i+1)+ ". Messwert: ");
            double x = input.nextDouble();
            messreihe[i] = x;
        }

        double[] ergebnis = berechneMittelwert(messreihe);
        System.out.println("Mittelwert: " + ergebnis[0] + "; Min: "+ergebnis[1]+ "; Max: "+ ergebnis[2]);
    }

    public static double[] berechneMittelwert(double[] messreihe){
        double[] values = new double[3];
        double sum = 0;
        for(double x : messreihe){
            sum += +x;
        }
        double mittelwert = sum / messreihe.length;
        values[0] = mittelwert;

        double min = messreihe[0];
        double max = messreihe[0];
        for(int i = 0; i< messreihe.length; i++){
            if(messreihe[i] < min){
                min = messreihe[i];
            }
            if(messreihe[i]>max){
                max = messreihe[i];
            }
        }
        values[1] = min;
        values[2] = max;

        return values;
    }
}
