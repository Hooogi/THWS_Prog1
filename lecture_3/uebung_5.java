package lecture_3;

import java.util.Scanner;
public class uebung_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matr_nr = input.nextInt();

        int[] validMatrikelnummer = new int[]{50,51,61};

        String matr_nr_String = String.valueOf(matr_nr);
        int matr_firstTwo = matr_nr / 100000;

        boolean validMtrNr = false;
        if(matr_nr_String.length()==7){
            for(int i: validMatrikelnummer){
                if(i==matr_firstTwo){
                    validMtrNr = true;
                }
            }
        }
        if(validMtrNr){
            System.out.println(matr_nr+" ist eine gültige Matrikelnummer");
        }
        else{
            System.out.println("ungültige Matrikelnummer");
        }
    }
}
