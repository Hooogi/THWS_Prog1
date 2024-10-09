package lecture_6;

public class uebung_1 {
    public static void main(String[] args) {

        System.out.println(roundNumber(5.486,0));
    }

    public static double roundNumber(double x, int z){
        int nks_shift = (int) Math.pow(10,z+1);
        double number = x * nks_shift;
        double last_Digit = number%10;

        if(last_Digit>=5.0){
            number += 10.0;
        }
        number -=(number%10);
        number/=nks_shift;

        return number;
    }
}

