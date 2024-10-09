package lecture_10;

public class uhr_main {
    public static void main(String[] args) {
        Uhr[] weltzeit = new Uhr[24];

        for(int i = 0; i<weltzeit.length;i++){
            weltzeit[i] = new Uhr(i,23,59);
        }



        for(Uhr uhr : weltzeit){
            System.out.println(uhr.getTime());
            uhr.nextSecond();
            System.out.println(uhr.getTime());
        }


    }
}
