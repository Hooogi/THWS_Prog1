package lecture_12;

public class test_liste_personenknoten {
    public static void main(String[] args) {
        Personenknoten Tom = new Personenknoten("Hogrefe", 26);
        Liste list = new Liste(Tom);
        Personenknoten Lukas = new Personenknoten("Langpeter", 27);
        Personenknoten Denis = new Personenknoten("Gashi", 20);
        Personenknoten Julian = new Personenknoten("Vogt", 18);
        Personenknoten Mo = new Personenknoten("Schattmann", 33);

        list.sortAndInsert(Lukas);
        list.sortAndInsert(Denis);
        list.sortAndInsert(Julian);
        list.sortAndInsert(Mo);
        list.sortAndInsert(Tom);

        System.out.println(list.searchByName("Hogrefe").toString());

        Personenknoten temp = list.getStart();

        while(temp != null){
            System.out.println(temp.getNachname());
            temp = temp.Nachfolger;
            if(temp.Nachfolger == null){
                System.out.println("Rückwärts:");
                while(temp != null){
                    System.out.println(temp.getNachname());
                    temp = temp.Vorgaenger;
                }
            }
        }
    }
}
