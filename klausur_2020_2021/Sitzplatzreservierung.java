package klausur_2020_2021;

public class Sitzplatzreservierung {

    char[][] saal;

    public Sitzplatzreservierung(int n){
        this.saal = erstelleSaal(n);
    }

    public static void main(String[] args) {
        Sitzplatzreservierung saal1 = new Sitzplatzreservierung(5);
        saal1.fuelleSitze();
        saal1.bucheSitz(3,5);
        saal1.printSaal();

    }

    public  static char[][] erstelleSaal(int anzahlReihen){
        char[][] saal = new char[anzahlReihen][];
        for(int i = 0, j = 3; i< saal.length; i++, j++){
            saal[i] = new char[j];
        }
        return saal;
    }

    public void fuelleSitze(){
        for(int i =0; i<this.saal.length; i++){
            for(int j = 0; j<this.saal[i].length; j++){
                int r = (int)(Math.random()*2);
                if(r==0){
                    this.saal[i][j] = 'x';
                }
                else{
                    this.saal[i][j]='o';
                }
            }
        }
    }

    public void bucheSitz(int reihe, int sitz){
        try{
            if(this.saal[reihe][sitz] == 'o'){
                this.saal[reihe][sitz]='x';
            }
            else{
                System.out.println("Platz nicht frei");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Platz existiert nicht!");
        }
    }

    public void printSaal(){
        String saal = "";
        for(int i=this.saal.length-1; i>=0; i--){
            for(int j=0; j<this.saal[i].length; j++){
                saal += this.saal[i][j];
            }
            saal+="\n";
        }
        System.out.println(saal);
    }
}
