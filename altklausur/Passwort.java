package altklausur;

public class Passwort {

    String password;

    public Passwort(String password){
        if(alsPWgeeignet(password)){
            this.password = password;
        }
        else {
            this.password = null;
        }
    }

    @Override
    public String toString(){
        if(this.password != null){
            String concPW = "";
            for(int i = 0; i<this.password.length(); i++){
                concPW+="*";
            }
            return concPW;
        }
        else{
            return "Kein gueltiges Passwort!";
        }
    }

    private void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
    public boolean pwAendern(String newPassword){
        if(this.password != null && alsPWgeeignet(newPassword)){
            if(this.password.charAt(0) != newPassword.charAt(0)&&this.password.charAt(this.password.length()-1)!=newPassword.charAt(newPassword.length()-1)){
                setPassword(newPassword);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public boolean alsPWgeeignet(String password){
        int[] validChars = {0,0,0};
        char[] passwordArray = password.toCharArray();

        if(passwordArray.length<8){
            return false;
        }
        else {
            for(char c : passwordArray){
                if('0'<=c && c<='9'){
                    validChars[0]+= 1;
                }
                else if('a'<=c && c<='z'){
                    validChars[1]+=1;
                }
                else if ('A'<=c&& c<='z'){
                    validChars[2]+=1;
                }

            }
            for(int x : validChars){
                if(x<2){
                    return false;
                }
            }
            return true;

        }
    }

    public static void main(String[] args) {
        Passwort pw = new Passwort("J0s!naH0gr3f3");
        System.out.println(pw.getPassword());
        pw.pwAendern("N!c0l3H0gr3f4");
        System.out.println(pw.getPassword());
        System.out.println(pw.toString());
    }
}
