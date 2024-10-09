package lecture_8;
import java.util.Scanner;
public class password_generator {
    public static void main(String[] args) {
        //String s = createPassword("Ich gehe morgen mit meinen 11 Freund*innen zum Essen!");
        //System.out.println(s);
        String s2 = createPassword2("Ich gehe morgen mit meinen 11 Freund*innen zum Essen!");
        System.out.println(s2);
    }

    public static String createPassword(String satz)   {
        String password="";
        String substring;
        int index = 0;
        for(int i = 0; i<satz.length(); i++){
            if(satz.charAt(i)==' ' || i == satz.length()-1){
                substring = satz.substring(index,i+1);
                char [] substringArray = substring.toCharArray();
                password += substring.charAt(0);
                for(int x = 1; x< substringArray.length; x++){
                    if(substringArray[x]=='!' || substringArray[x]=='?' || substringArray[x]==':' || substringArray[x]=='%'){
                        password+=substringArray[x];
                    }
                }
                index = i+1;
            }

        }

        return checkPassword(password);
    }

    public static String createPassword2(String satz)   {
        String password="";
        String substring;
        boolean lowerCase=true;
        int index = 0;

        for(int i = 0; i<satz.length(); i++){
            if(satz.charAt(i)==' ' || i == satz.length()-1){
                substring = satz.substring(index,i+1);
                char [] substringArray = substring.toCharArray();
                char lastChar;
                if(i == satz.length()-1){
                    lastChar = substringArray[substringArray.length-1];
                }
                else{
                    lastChar = substringArray[substringArray.length-2];
                }
                if((64<lastChar&&lastChar<91)||(96<lastChar&&lastChar<123)){
                    if(lowerCase){
                        password += lastChar;
                    }
                    else{
                        char c = lastChar;
                        c -= 32;
                        password += c;
                    }
                }
                else{
                    password += lastChar;
                }
                for(int x = 0; x< substringArray.length-1; x++){
                    if(substringArray[x]=='!' || substringArray[x]=='?' || substringArray[x]==':' || substringArray[x]=='%'){
                        password+=substringArray[x];
                    }
                }
                index = i+1;
                lowerCase=!lowerCase;
            }

        }

        return checkPassword(password);
    }
    public static String checkPassword(String password){
        boolean checkLength = false;
        boolean checkSpecial= false;
        boolean checkNumber = false;

        char[] passwordArray = password.toCharArray();
        if(password.length()>=8 && password.length()<= 15){
            checkLength = true;
        }
        for(char c : passwordArray){
            if(c<58 && c>47){
                checkNumber=true;
            }
            if(c=='!' || c=='%' || c==':' || c=='?'){
                checkSpecial = true;
            }
        }
        if(checkLength&&checkNumber&&checkSpecial){
            return password;
        }
        else{
            return "Ungültige Eingabe.";
        }
    }
}
