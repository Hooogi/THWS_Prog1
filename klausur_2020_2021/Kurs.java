package klausur_2020_2021;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Kurs {
    String Kursart;
    int Kursdauer;
    Mitglied[] Mitglieder;

    public Kurs(String kursart, int kursdauer, int Mitgliederanzahl){
        this.Kursart = kursart;
        this.Kursdauer = kursdauer;
        this.Mitglieder = new Mitglied[Mitgliederanzahl];
    }

    public void anmeldungKurs(Mitglied Teilnehmer){
        for(int i = 0; i< this.Mitglieder.length; i++){
            if(this.Mitglieder[i] == Teilnehmer){
                return;
            }
            else if(this.Mitglieder[i] == null){
                this.Mitglieder[i] = Teilnehmer;
                Teilnehmer.setKurs(this);
                return;
            }
        }
        System.out.println("Kurs ist bereits voll.");
    }

    public void abmeldungKurs(Mitglied Teilnehmer){
        for(int i = 0; i< this.Mitglieder.length; i++){
            if(Teilnehmer.getMitgliedsnummer() == this.Mitglieder[i].getMitgliedsnummer()){
                this.Mitglieder[i] = null;
                return;
            }
        }
        System.out.println("Mitglied war kein Teilnehmer im Kurs.");
    }

    public static void main(String[] args){
        Kurs Karate = new Kurs("Karate",60, 25);
        Kurs Judo = new Kurs("Judo", 90, 20);
        Kurs Boxen = new Kurs("Boxen", 90, 10);
        Kurs[] Kurse = new Kurs[3];
        Kurse[0] = Karate;
        Kurse[1] = Judo;
        Kurse[2] = Boxen;

        Scanner input = new Scanner(System.in);
        boolean gueltigerKurs = false;
        do{
            try{
                System.out.println("Kursart: ");
                String type = input.nextLine();
                for(int i = 0; i<Kurse.length;i++){
                    if(type.equals(Kurse[i].Kursart)){
                        gueltigerKurs = true;
                        System.out.println(Kurse[i].Kursdauer +" "+ Kurse[i].Mitglieder.length);
                    }
                }
                if(!gueltigerKurs){
                    throw new RuntimeException("Ungueltiger Kurs");
                }
            }
            catch(RuntimeException e){
                gueltigerKurs=false;
                System.out.println("ungueltige Kursart");
            }
        } while(!gueltigerKurs);

    }
}
