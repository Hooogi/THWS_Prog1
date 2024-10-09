package klausur_2020_2021;

public class aufgabe_2 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
}
