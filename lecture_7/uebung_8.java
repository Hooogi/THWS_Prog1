package lecture_7;

public class uebung_8 {
    public static void main(String[] args) {
        siebe(12);
    }

    public static void siebe(int x){
        int[] zahlen_array = new int[x+1];
        for(int i = 0; i<zahlen_array.length; i++){
            if(i==0 || i==1){
                zahlen_array[i] = 0;
            }
            else{
                zahlen_array[i] = 1;
            }
        }
        for(int i = 2; i<Math.sqrt(x); i++){
            for(int z = i+1; z<zahlen_array.length; z++){
                if(z%i==0){
                    zahlen_array[z]=0;
                }
            }
        }
        for(int i = 0; i<zahlen_array.length; i++){
            if(zahlen_array[i]==1){
                System.out.println(i+" ist eine Primzahl");
            }
            else{
                System.out.println(i+" ist keine Primzahl");
            }
        }
    }
}
