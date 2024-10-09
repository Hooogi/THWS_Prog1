package lecture_11;

public class betrag {
    public static void main(String[] args) {
        double x = -7.75;
        int z = -67;

        System.out.println(betrag(x));
        System.out.println(betrag(z));
    }

    public static int betrag(int x){
        if(x<0){
            x=x*(-1);
        }
        return x;
    }
    public static double betrag(double x){
        if(x<0.00E-10){
            x=x*(-1);
        }
        return x;
    }
}
