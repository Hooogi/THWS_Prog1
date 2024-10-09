package lecture_7;

public class uebung_3 {
    public static void main(String[] args) {
        char[] array = new char[]{'a','b','c','d','E','F'};

        char[] toCapital = toCapital(array);
        for(char c : toCapital){
            System.out.print(c + " ");
        }
    }

    public static char[] toCapital(char[] chararray){
        for(int i = 0; i< chararray.length; i++){
            if(chararray[i]>=97){
                chararray[i] -= 32;
            }
        }
        return chararray;
    }
}
