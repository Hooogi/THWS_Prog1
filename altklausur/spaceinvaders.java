package altklausur;

public class spaceinvaders {
    public static void main(String[] args) {
        char[][] array = initialisiere();
        for(int i = 0; i < array.length;i++){
            System.out.println(String.valueOf(array[i]));
        }
        bewege('a',array);
        for(int i = 0; i < array.length;i++){
            System.out.println(String.valueOf(array[i]));
        }

    }


    public static char[][] initialisiere(){
        char[][] spielfeld = new char[4][8];
            for(int i = 0; i<spielfeld[0].length; i++){
                spielfeld[0][i] = 'o';
            }
            for(int i = 1; i<=3;i++){
                for(int x = 0; x< spielfeld[i].length; x++){
                    spielfeld[i][x]=' ';
                }
            }
            int position = (int) (Math.random()*7);
            spielfeld[3][position] = 'v';

        return spielfeld;
    }

    public static void bewege(char c, char[][] spielfeld){
            int position =0;
             for(int i = 0; i<spielfeld[3].length;i++){
                 if(spielfeld[3][i] == 'v'){
                     position = i;
                 }
             }
             if(c == 'a' && position != 0){
                 spielfeld[3][position]=' ';
                 spielfeld[3][position-1] = 'v';
             }
             else if(c == 'd' && position !=7){
                 spielfeld[3][position] = ' ';
                 spielfeld[3][position+1]='v';
             }
    }

    public void toString(char[][] spielfeld){
        for(int i = 0; i < spielfeld.length;i++){
            System.out.println(String.valueOf(spielfeld[i]));
        }
    }
}
