package lecture_5;
import java.util.Scanner;
public class uebung_2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double b = input.nextDouble();
            int x = input.nextInt();

            double bHochX=1;

            for(int i=0; i<x;i++){
                bHochX = bHochX*b;
            }
        System.out.println(bHochX);
    }
}
