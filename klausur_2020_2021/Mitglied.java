package klausur_2020_2021;

public class Mitglied {

    int Mitgliedsnummer;
    Kurs kurs;

    public void setKurs(Kurs kurs){
        this.kurs = kurs;
    }

    public int getMitgliedsnummer(){
        return this.Mitgliedsnummer;
    }
}
