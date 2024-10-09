package buch_heinzl;

public class Kunde {
    String name;
    Bestellung order;

    public Kunde(String name, Bestellung order){
        this.name = name;
        this.order = order;
    }

    public Bestellung findArticle(String articlename){
        Bestellung tempOrder = order;
        while(order!=null){
            Artikel tempArt = tempOrder.artikel;
            while(tempArt != null){
                if(articlename.equals(tempArt.getArtikelname())){
                    return tempOrder;
                }
                else{
                    tempArt = tempArt.nextPosition;
                }
            }
            tempOrder = tempOrder.nextOrder;
        }
        return null;
    }
}
