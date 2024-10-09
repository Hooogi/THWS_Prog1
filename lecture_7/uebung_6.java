package lecture_7;

public class uebung_6 {
    public static void main(String[] args) {
        int[] array = lotto();
        for(int x : array){
            System.out.println(x);
        }
    }

    public static int[] lotto(){
        int[] lottozahlen = new int[6];
        boolean doppelt;
        for(int i = 0; i< lottozahlen.length; i++){
            doppelt = true;
            while(doppelt){
                int x = (int)(Math.random()*49)+1;
                for(int z : lottozahlen){
                    if(z == x){
                        doppelt = true;
                        break;
                    }
                    else{
                        doppelt = false;
                    }
                }
                if(!doppelt){
                    lottozahlen[i] = x;
                }
            }
        }
        return lottozahlen;
    }
}
