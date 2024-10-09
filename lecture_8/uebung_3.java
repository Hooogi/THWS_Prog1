package lecture_8;

public class uebung_3 {
    public static void main(String[] args) {
        char operator = args[args.length-1].charAt(0);
        int value = 0;

        for(String s : args){
            if(operator==43){
                value+= Integer.valueOf(s);
            }
            else{
                value-= Integer.valueOf(s);
            }
        }

        System.out.println(value);

    }

}
