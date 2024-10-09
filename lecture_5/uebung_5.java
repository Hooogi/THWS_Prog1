package lecture_5;
import java.util.Scanner;
public class uebung_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Anzahl Rechtecke:");
        double rectangles = input.nextInt();

        double rectangleWidth = 1/rectangles;
        int radius = 1;

        double firstRectangle = 1*rectangleWidth;
        double piViertel = 0;

        for(int i = 1; i<rectangles;i++){
            double rectangleLength = Math.sqrt(radius - Math.pow(i*rectangleWidth,2));
            double rectangleArea = rectangleLength*rectangleWidth;
            piViertel += +rectangleArea;
        }
        System.out.println(piViertel+firstRectangle);
        System.out.println((piViertel+firstRectangle)*4);
    }

}
