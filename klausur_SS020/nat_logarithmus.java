package klausur_SS020;

public class nat_logarithmus {
    public static void main(String[] args) {
        System.out.println(natLog(0.7));

        int potenz_val=1;
        int basis = 3;
        int exponent = 2;
        for(int i = 1; i<=exponent; i++){
            potenz_val = potenz_val*basis;
        }
        System.out.println(potenz_val);

    }


    public static double natLog(double x) {
        if(0<x && x<2){
            double value = 0;
            double sum;
            int n = 1;
            while(true){
                sum = (powerOfX(-1,n+1)*powerOfX(x-1,n))/n;
                n++;
                double sum_betrag;
                if(sum<0){
                    sum_betrag = sum*(-1);
                }
                else{
                    sum_betrag = sum;
                }
                if(sum_betrag<10e-16){
                    break;
                }
                value += sum;
            }
            return value;
        }
        else {
            throw new RuntimeException();
        }
    }

    public static double powerOfX(double x, int exp){
        if(exp == 0){
            return 1;
        }
        else{
            return x*powerOfX(x,exp-1);
        }
    }

}


