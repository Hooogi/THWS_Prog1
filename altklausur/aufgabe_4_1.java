package altklausur;

public class aufgabe_4_1 {
    public static void main(String[] args) {
        printQuadrat(5);
    }

    public static void printQuadrat(int zeilen){
        char[][] Quadrat = new char[zeilen][zeilen];
        for(int i = 0; i< Quadrat.length; i++){
            Quadrat[i][0]='*';
            Quadrat[i][Quadrat[i].length-1]='*';

            for(int x =1; x< Quadrat[i].length-1;x++){
                if(i==0 || i == zeilen-1){
                    Quadrat[i][x]='*';
                }
                else{
                    Quadrat[i][x]=' ';
                }
            }

        }
        for(char[] x : Quadrat){
            System.out.println(String.valueOf(x));
        }
    }
}
