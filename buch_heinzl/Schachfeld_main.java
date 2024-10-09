package buch_heinzl;

public class Schachfeld_main {
    public static void main(String[] args) {
        Schachfeld xyz = new Schachfeld();

        xyz.gibVomSpringerErreichbareFelder(4,4);
        xyz.gibSchachfeldAus();
    }
}
