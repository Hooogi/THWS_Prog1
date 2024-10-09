package altklausur;

public class Kunde {

    Bestellung[] bestellungen = new Bestellung[50];

    public Kunde(Bestellung[] bestellungen){
        this.bestellungen = bestellungen;
    }

    public Bestellung checkForArticle(Artikel artikel){
        boolean found = false;
        for(Bestellung order: bestellungen){
            for(Artikel a : order.getArtikel()){
                if(a == artikel){
                    found = true;
                }
            }
            if(found){
                return order;
            }
        }
        return null;
    }
}
