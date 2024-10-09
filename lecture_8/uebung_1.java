package lecture_8;
import java.util.Scanner;

public class uebung_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] words = {"Programmieren", "Wirtschaftsinformatik", "Hochschule", "Mathematik","Vorlesung"};
        String chosen_word = words[(int)(Math.random()*5)];
        char[] hidden_word = wordToBlanks(chosen_word);

        int versuche = 0;
        int max_versuche = 10;
        while(versuche < max_versuche){
            System.out.print("Bitte geben sie einen Buchstaben ein: ");
            String input_letter = input.nextLine();
            char c = input_letter.charAt(0);

            if(stringContainsCharacter(chosen_word,c)){
                hidden_word = galgenmaennchen(chosen_word,hidden_word, c);
                System.out.println("Richtig getippt!");
                System.out.println(String.valueOf(hidden_word));
            }
            else{
                versuche++;
                System.out.println("Leider falsch! Bleibende Versuche: "+ (max_versuche-versuche));
                System.out.println(String.valueOf(hidden_word));
            }
            if(chosen_word.equals(String.valueOf(hidden_word))){
                System.out.println("Das Wort "+ chosen_word+" wurde richtig erraten!");
                break;
            }
            if(versuche==max_versuche){
                System.out.println("Leider verloren! Das gesuchte Wort war: "+ chosen_word);
                break;
            }
        }

    }

    public static char[] wordToBlanks(String s){
        char[] word_array = s.toCharArray();
        char[] hidden_word_array = new char[word_array.length];

        for(int i = 0; i< hidden_word_array.length;i++){
            hidden_word_array[i]='_';
        }
        return hidden_word_array;
    }

    public static boolean stringContainsCharacter(String s, char c){
        char[] word_array = s.toCharArray();
        boolean contains = false;
        for(char a : word_array){
            if(a == c || a == c-32){
                contains = true;
            }
        }
        return contains;
    }

    public static char[] galgenmaennchen(String word, char[] hidden_word, char c){
        char[] word_array = word.toCharArray();

        for(int i = 0; i< word_array.length;i++){
            if(c == word_array[i]){
                hidden_word[i]=c;
            }else if (c-32==word_array[i]){
                hidden_word[i]=c;
                hidden_word[i]-= 32;
            }else if(c+32== word_array[i]){
                hidden_word[i]=c;
                hidden_word[i]+=32;
            }
        }
        return hidden_word;
    }
}