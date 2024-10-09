package lecture_7;

public class uebung_1 {
    public static void main(String[] args) {
        System.out.println(calculateSinus(5));
    }

    public static double calculateSinus(double x){
        double value = 0;
        double summand = 1;
        for(int i = 0; summand > 1E-15 || summand < -1E-15; i++){
            summand = powerOf(-1,i)*(powerOf(x,2*i+1)/fak(2*i+1));
            value+= summand;
        }
        return value;
    }

    public static double powerOf(double x, double exp){
        double value;
        if(exp==0){
            return 1;
        }
        value = x * powerOf(x,exp-1);
        return value;
    }

    public static double fak(double x){
        double value;
        if(x==1){
            return 1;
        }
        value = x * fak(x-1);
        return value;
    }
}
