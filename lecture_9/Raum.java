package lecture_9;

public class Raum {

    private String name;
    private int size;
    private boolean occupied;

    public Raum(String name, int size){
        this.name = name;
        this.size = size;
        this.occupied = false;
    }
    //nicht nötig
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    //nicht nötig
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }

    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }
    public boolean getOccupied(){
        return this.occupied;
    }

}
