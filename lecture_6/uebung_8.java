package lecture_6;

public class uebung_8 {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int x){
        if(x==1){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int value = fibonacci(x-2)+fibonacci(x-1);
        return value;
    }
}
