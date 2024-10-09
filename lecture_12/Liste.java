package lecture_12;

public class Liste {

    private Personenknoten start;

    public Liste(Personenknoten start){
        this.start = start;
    }

    public void setStart(Personenknoten personenknoten){
        this.start = personenknoten;
    }

    public Personenknoten getStart() {
        return this.start;
    }

    public void sortAndInsert(Personenknoten knoten){
        Personenknoten temp = this.start;
        if(temp == null){
            this.setStart(knoten);
        }
        else{
            while(temp != null){
                if(temp == knoten){
                    System.out.println("Eintrag bereits in Liste vorhanden!");
                    break;
                }
                else if(knoten.getAlter() < temp.getAlter() && temp == this.start){
                    this.setStart(knoten);
                    knoten.Nachfolger = temp;
                    temp.Vorgaenger = knoten;
                    break;
                }
                else if(knoten.getAlter() < temp.getAlter()){
                    knoten.Nachfolger = temp;
                    knoten.Vorgaenger = temp.Vorgaenger;
                    temp.Vorgaenger.Nachfolger = knoten;
                    temp.Vorgaenger = knoten;
                    break;
                }
                else if(temp.Nachfolger == null){
                    temp.Nachfolger = knoten;
                    knoten.Vorgaenger = temp;
                    break;
                }
                else{
                    temp = temp.Nachfolger;
                }
            }
        }
    }

    public Personenknoten searchByName(String name){
        Personenknoten temp = start;
        while(temp != null){
            if(temp.getNachname().equals(name))
                return temp;
            else{
                temp = temp.Nachfolger;
            }
        }
        return null;
    }

}
