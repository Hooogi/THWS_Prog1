package altklausur;

public class Bestellung {
    private int bestellnr;
    private Artikel[] Artikel = new Artikel[50];

    public Bestellung(int bestellnr, Artikel[] artikel){
        this.bestellnr = bestellnr;
        this.Artikel = artikel;
    }

    public Artikel[] getArtikel(){
        return this.Artikel;
    }

    public void setArtikel(Artikel[] Artikel){
        this.Artikel = Artikel;
    }
    //Aufgabe 3 c) Vorteile - Nachteile Array:
    // Vorteile: leichtere Implementierung
    // Nachteile: es werden immer 50 Speicherplätze für Artikel reserviert, Einfügen von Artikeln nur nach bereits vorhanden
    //            Artikeln möglich
    // Vorteile Liste: dynamische Länge, Speichereffizienter
    // Nachteile: Zugriff auf einzelne Elemente nicht mit Index möglich!

    // Aufgabe 3 d) loeschen(Artikel artikel) Rückgabetyp: void
    public void einfuegen(Artikel art){
        for(int i = 0; i<this.Artikel.length; i++){
            if(this.Artikel[i] == null){
                this.Artikel[i] = art;
                break;
            }
        }
    }
}
