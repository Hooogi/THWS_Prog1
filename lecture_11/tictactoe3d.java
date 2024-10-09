package lecture_11;

public class tictactoe3d {
    public static void main(String[] args) {
        boolean[][][] tictactoe = initTTT();
        outputArray(tictactoe);

    }

    public static boolean[][][] initTTT(){
        boolean[][][] tictactoe = new boolean[3][3][3];

        for(int i = 0; i < tictactoe.length; i++){
            for(int ii = 0; ii < tictactoe[i].length; ii++){
                for(int iii = 0; iii < tictactoe[i][ii].length; iii++){
                    int x = (int) (Math.random()*2);
                    if(x == 0){
                        tictactoe[i][ii][iii]= true;
                    }
                    else{
                        tictactoe[i][ii][iii]=false;
                    }
                }

            }
        }
        return tictactoe;
    }

    public static void outputArray(boolean[][][] tictactoe){
        for(int i = 0; i < tictactoe.length; i++){
            for(int ii = 0; ii < tictactoe[i].length; ii++){
                for(int iii = 0; iii < tictactoe[i][ii].length; iii++){
                    if(tictactoe[i][ii][iii]){
                        System.out.println("x");
                    }
                    else{
                        System.out.println("o");
                    }
                }

            }
        }
    }
}
