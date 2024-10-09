package lecture_6;

public class uebung_1_01 {
    public static void main(String[] args) {

        System.out.println(roundNumber(4.5,0));
    }

    public static double roundNumber(double x, int z){
        int nks_shift = powerOfX(10,z);
        double number = x * nks_shift;
        double last_Digit = number%1;

        if(last_Digit>=0.5){
            number += 1.0;
        }
        number -=(number%1);
        number/=nks_shift;

        return number;
    }

    public static int powerOfX(int x, int exp){
        if(exp == 0){
            return 1;
        }
        int value = x * powerOfX(x, exp-1);
        return value;
    }
}

