package buch_heinzl;

public class Artikel {
    private int Artikelnummer;
    private String Artikelname;
    Artikel nextPosition;

    public Artikel(int Artikelnummer, String Artikelname){
        this.Artikelnummer = Artikelnummer;
        this.Artikelname = Artikelname;
    }

    public void setArtikelnummer(int Artikelnummer) {
        this.Artikelnummer = Artikelnummer;
    }
    public void setArtikelname(String Atrikelname){
        this.Artikelname = Artikelname;
    }

    public int getArtikelnummer(){
        return this.Artikelnummer;
    }

    public String getArtikelname(){
        return this.Artikelname;
    }
}
