package buch_heinzl;

public class Bestellung {
    int Bestellnummer;

    Bestellung nextOrder;
    Artikel artikel;

    public Bestellung(Artikel artikel, int Bestellnummer){
        this.artikel = artikel;
        this.Bestellnummer = Bestellnummer;
    }

    public void einfuegen(Artikel newArtikel){
        Artikel temp  = this.artikel;
        while(temp!=null){
            if(temp.nextPosition == null){
                temp.nextPosition = newArtikel;
                break;
            }
            else{
                temp = temp.nextPosition;
            }
        }
    }
}

//Vorteile Liste: schnelles Einfügen, variable Länge (Speicherplatz wird erst bei der Initialisierung neuer
// Objekte reserviert), leichtes Einfügen mit Sortierung innerhalb der Liste

//Nachteile Liste: Kein Index -> kein Zugriff über Index auf einzelne Positionen der Bestellung,
//entfernt man einen Artikel unsauber, können nachfolgende Artikel leicht verloren gehen, Abrufen der Artikel
// ist erst durch den weiteren Aufruf des Artikelattributes der Bestellung möglich und nich direkt über die
// Bestellung