package lecture_7;

public class uebung_4 {
    public static void main(String[] args) {
        System.out.println(spielen("spiel"));
    }


    public static String spielen(String s){
        char[] char_Array = s.toCharArray();

        int anzahl_Vokale = 0;
        char[] vokale = {'A','E','I','O','U','a','e','i','o','u'};

        for(char c : char_Array){
            for(char a : vokale){
                if(c == a){
                    anzahl_Vokale++;
                }
            }
        }

        char[] b_array = new char[char_Array.length + (2*anzahl_Vokale)];
        int index = 0;
        boolean vokal = false;

        for(int i= 0; i< char_Array.length;i++){
            vokal = false;
            for(char a: vokale){
                if(char_Array[i]== a){
                    vokal = true;
                }
            }
            if(vokal){
                b_array[index] = char_Array[i];
                b_array[(index+1)] = 'b';
                b_array[(index+2)] = char_Array[i];
                index+=3;
            }
            else {
                b_array[index] = char_Array[i];
                index++;
            }
        }
        return String.valueOf(b_array);
    }
}
