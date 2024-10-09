package buch_heinzl;

public class magisches_Quadrat_main {
    public static void main(String[] args) {
        int[][] quadrat = {{6,7,2},{1,5,9},{8,3,4}};
        magisches_Quadrat mag_quadrat = new magisches_Quadrat(quadrat);

        System.out.println(mag_quadrat.berechneHauptdiagonale());
        System.out.println(mag_quadrat.berechneGegendiagonale());
    }
}
