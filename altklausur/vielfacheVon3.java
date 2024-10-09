package altklausur;

public class vielfacheVon3 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        //3 6 9 12 15 18
        System.out.println(vielfachesVonDrei(array));
    }

    public static int vielfachesVonDrei(int[] array){
        int counter = 0;

        for(int x : array){
            if(x%3 == 0 && x!=0){
                System.out.println(x);
                counter++;
            }
        }

        return counter;
    }
}
