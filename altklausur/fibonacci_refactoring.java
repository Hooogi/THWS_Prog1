package altklausur;
//zusätzliche Übungsaufgabe Zilker L.7
public class fibonacci_refactoring {
    public static void main(String[] args) {
        int[] array = fibonacci(30);
        System.out.println(fibonacciLine(array));

    }

    public static int[] fibonacci(int n){
        int[] fibArray = new int[n+1];

        for(int i = 0; i< fibArray.length;i++){
            if(i==0){
                fibArray[i]= 0;
            } else if (i == 1) {
                fibArray[i]= 1;
            }
            else{
                fibArray[i] = fibArray[i-1]+fibArray[i-2];
            }

        }
        return fibArray;
    }

    public static String fibonacciLine(int[] array){
        String fibString ="";

        for(int x : array){
            fibString += x+" ";
        }
        return fibString;
    }
}
