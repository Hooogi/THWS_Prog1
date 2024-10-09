package altklausur;

public class alternierendeHarmonischeKette {
    public static void main(String[] args) {
        for(int i = 1; i<=10000;i++){
            double value = powerOfX(-1, (i+1))/i;
            System.out.println(value);
        }
    }

    public static double powerOfX(int x, int exp){
        if(exp==0){
            return 1;
        }
        else {
            return x * powerOfX(x, exp-1);
        }
    }
}
