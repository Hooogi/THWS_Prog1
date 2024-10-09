package lecture_11;

public class Ticker {

    char[] nachricht;

    public Ticker(int x){
        if(x < 0){
            this.nachricht = new char[200];
        }
        else{
            this.nachricht = new char[x];
        }
        for(int i = 0; i < this.nachricht.length; i++){
            this.nachricht[i] = ' ';
        }
    }

    public char[] getNachricht(){
        //erstellt ein zweites Array, anstatt nur die Referenz auf das Attribut nachricht zu kopieren
        char[] copyMessage = new char[this.getGroesse()];
        for(int i = 0; i<copyMessage.length;i++){
            copyMessage[i] = this.nachricht[i];
        }
        return copyMessage;
    }

    public int getGroesse(){
        return this.nachricht.length;
    }

    public void setNachricht(String message){
        char[] messageArray = message.toCharArray();

        if(messageArray.length < this.nachricht.length){
            for(int i = 0; i< this.nachricht.length;i++){
                if(i< messageArray.length){
                    this.nachricht[i] = messageArray[i];
                }
                else{
                    this.nachricht[i] = '+';
                }
            }
        }
        else{
            for(int i = 0; i<this.nachricht.length; i++){
                this.nachricht[i] = messageArray[i];
            }
        }
    }

    public void resetNachricht(char zeichen){
        for(int i = 0; i<this.nachricht.length;i++){
            this.nachricht[i] = zeichen;
        }
    }

    public void resetNachricht(){
        for(int i = 0; i<this.nachricht.length;i++){
            this.nachricht[i] = '+';
        }
    }

    public void rotateNachricht(int x){
        char[] copy = this.getNachricht();
        for(int i = 0; i < this.nachricht.length; i++){
            if(i < x){
                this.nachricht[this.nachricht.length-(x-i)]= copy[i];
            }
            else{
                this.nachricht[i-x] = copy[i];
            }
        }
    }
}
