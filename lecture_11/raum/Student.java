package lecture_11.raum;

public class Student {

    private String name;
    private int matrikelnummer;

    private boolean handUp;

    public Student(String name, int matrikelnummer){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.handUp = false;
    }

    public String getName(){
        return this.name;
    }
    public int getMatrikelnummer(){
        return this.matrikelnummer;
    }

    public boolean getHandup(){
        return this.handUp;
    }

    public void setHandUp(boolean state){
        this.handUp = state;
    }

}
