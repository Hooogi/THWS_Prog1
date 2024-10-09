package lecture_12;

public class Personenknoten {

    private String nachname;
    private int alter;

    Personenknoten Vorgaenger;
    Personenknoten Nachfolger;

    public Personenknoten(String nachname, int alter){
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getNachname(){
        return this.nachname;
    }

    public int getAlter(){
        return this.alter;
    }
    @Override
    public String toString(){
        return "Name: "+ this.nachname + ", Alter: "+ this.getAlter();
    }
}
