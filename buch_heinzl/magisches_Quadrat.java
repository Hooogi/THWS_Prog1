package buch_heinzl;

public class magisches_Quadrat {

    int[][] quadrat;

    public magisches_Quadrat(int[][] quadrat){
        if(quadrat.length == quadrat[0].length){
            this.quadrat = quadrat;
        }
        else{
            System.err.println("Kein Quadrat!");
        }
    }

    public int berechneHauptdiagonale(){
        int summe = 0;
        for(int i = 0, j = 0; i < this.quadrat.length; i++, j++){
            summe += this.quadrat[i][j];
        }
        return summe;
    }

    public int berechneGegendiagonale(){
        int summe = 0;
        for(int i = this.quadrat.length-1, j = this.quadrat.length-1; i>= 0; i--, j--){
            summe += this.quadrat[i][j];
        }
        return summe;
    }


}
