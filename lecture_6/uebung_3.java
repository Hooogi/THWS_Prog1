package lecture_6;

public class uebung_3 {
    public static void main(String[] args) {
        dreieck(8);
    }

    public static void dreieck(int x){
        String stern = "* ";
        String filler= " ";
        for(int i =0; i<x;i++){
            String s ="";
            for(int y = x; y>i; y--){
                s = s.concat(filler);
            }
            for(int z =0; z<=i;z++){
                s = s.concat(stern);
            }
            System.out.println(s);
        }
    }
}
//   *
//12345678
//  * *
//12345678
// * * *
//12345678
//* * * *
//12345678