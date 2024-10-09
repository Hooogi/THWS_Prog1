package lecture_10;

public class Autofabrik {

    String name;
    int count;

    public Autofabrik(String name){
        this.name = name;
        this.count = 0;
    }

    public void produce(int amount){
        Auto[] cars = new Auto[amount];
        for(int i = 0; i<cars.length; i++){
            cars[i] = new Auto(i,"C Klasse", 2023, 3000);
            this.count++;
        }

    }
}
