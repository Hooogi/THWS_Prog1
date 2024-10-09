package altklausur;

public class minessweeper {

    char[][] minefield;

    public minessweeper(){
        this.minefield = new char[8][8];
    }

    private void fillMinefield(){

    }

    private void placeMines(){
        int mines = 10;
        while(mines > 0){
            int x = (int)((Math.random()+1)*64);
            int row = x/8;
            int field= x%8;
            if(this.minefield[row][field] == 0){
                this.minefield[row][field] = 'x';
            }

            mines--;
        }
    }
}
