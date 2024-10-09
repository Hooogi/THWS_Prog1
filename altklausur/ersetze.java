package altklausur;

public class ersetze {
    public static void main(String[] args) {
        String s = "Graphik.Init.Datei.ini";
        System.out.println(ersetze(s.toCharArray()));

        //Aufgabe b
        String a = "";
        char[] array = s.toCharArray();
        int x = ersetze(s.toCharArray());
        for(int i = 0; i < array.length;i++){
            if(array[i]=='.'){
                array[i]='_';
                x--;
            }
            if(x==0){
                break;
            }

        }
        for(int i = 0; i< array.length;i++){
            a+= array[i];
        }
        System.out.println(a);


    }
    //Aufgabe a
    public static int ersetze(char[] array){
        int count = 0;
        for(int i =0; i< array.length-4;i++){
            if(array[i] == '.'){
                count++;
            }
        }
        return count;
    }
}
