package lecture_5;
import java.util.Scanner;
public class uebung_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y= 1;
        double sqrroot;
        double absoluteY;
        final double grenzwert = 10e-10;

        do{
            sqrroot = (y+(x/y))/2;
            y = sqrroot;
            absoluteY = (x/y)-y;
            if(absoluteY <0e-9){
                absoluteY *=-1;
            }
        }
        while(absoluteY > grenzwert);

        System.out.println(y);

    }

}
