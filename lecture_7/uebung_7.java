package lecture_7;

public class uebung_7 {
    public static void main(String[] args) {
        System.out.println(reverse("Programmieren"));
    }

    public static String reverse(String s){
        char[] s_array = s.toCharArray();
        char[] s_reverse_array = new char[s_array.length];

        for(int i = s_array.length-1, z=0; i>=0;i--,z++){
            s_reverse_array[z]= s_array[i];
        }

        return String.valueOf(s_reverse_array);
    }
}
