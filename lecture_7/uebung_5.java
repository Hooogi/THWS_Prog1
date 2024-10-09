package lecture_7;

public class uebung_5 {
    public static void main(String[] args) {
        System.out.println(schreibtisch());
    }

    public static double schreibtisch(){
        int anzahl_gefunden = 0;
        for(int i = 0; i<10000;i++){
            int x = (int)(Math.random()*2);
            if (x==1){
                anzahl_gefunden++;
            }
        }
        double wahrscheinlichkeit = anzahl_gefunden/10000.00;
        return wahrscheinlichkeit;
    }
}
