package klausur_2020_2021;

public class Roboter {

    private String name;
    private int height;
    Roboter successor;

    public Roboter(String name, int height){
        this.name = name;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setSuccessor(Roboter successor){
        this.successor = successor;
    }
    public String getName(){
        return this.name;
    }
    public int getHeight(){
        return this.height;
    }
    public Roboter getSuccessor(){
        return this.successor;
    }

    @Override
    public String toString(){
        return "Hallo ich bin "+this.name+" und bin "+this.height+" Zentimeter groß.";
    }
}
