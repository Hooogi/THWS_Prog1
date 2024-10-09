package buch_heinzl;

public class Schachfeld {
    boolean[][] Schachfeld;

    public Schachfeld(){
        this.Schachfeld = new boolean[8][8];
        for(int i = 0; i<Schachfeld.length; i++){
            for(int j = 0; j <Schachfeld[i].length; j++){
                Schachfeld[i][j] = false;
            }
        }
    }

    public void markierePosition(int x, int y){
        if(checkPos(x)&& checkPos(y)){
            this.Schachfeld[x-1][y-1] = true;
        }
    }

    public Schachfeld gibVomSpringerErreichbareFelder(int x, int y){
        int[][] moves ={{2,1},{2,-1},{-2,1},{-2,-1}};
        if(checkPos(x)&&checkPos(y)){
            markierePosition(x,y);
            for(int i = 0; i<moves.length; i++){
                markierePosition(x+moves[i][0],y+moves[i][1]);
                markierePosition(x+moves[i][1],y+moves[i][0]);
            }
        }
        return this;
    }

    private boolean checkPos(int x){
        if(0<x && x<8){
            return true;
        }
        else{
            return false;
        }
    }

    public void gibSchachfeldAus(){

        for(int i = 0; i<this.Schachfeld.length;i++){
            String output ="";
            for(int j = 0; j<this.Schachfeld[i].length; j++){
                if(this.Schachfeld[i][j]){
                    output+="x ";
                }
                else{
                    output+="o ";
                }
            }
            System.out.println(output);
        }
    }

}
