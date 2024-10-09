package lecture_6;

public class uebung_5 {
    public static void main(String[] args) {
        System.out.println(powerOfX(3,2));
    }

    public static int powerOfX(int x, int exp){
        if(exp == 0){
            return 1;
        }
        int value = x * powerOfX(x, exp-1);
        return value;
    }
}
