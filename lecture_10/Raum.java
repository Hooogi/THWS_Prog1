package lecture_10;

public class Raum {

    private String name;
    private int size;
    private Student[] occupants;
    private boolean occupied;



    public Raum(String name, int size){
        this.name = name;
        this.size = size;
        this.occupied = false;
        this.occupants = new Student[size];
    }

    public String getName(){
        return this.name;
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
    public void betreteRaum(Student student){
        if(this.freeSeats()==0){
            System.out.println("Der Raum ist voll!");
        }
        else{
            for(int i = 0; i<this.occupants.length; i++){
                if(this.occupants[i]==null){
                    this.occupants[i]= student;
                    break;
                }
            }
        }
    }

    public void verlasseRaum(Student student){
        boolean studentInRoom = false;
        for(int i = 0; i<this.occupants.length;i++){
            if(this.occupants[i]==student){
                this.occupants[i] = null;
                studentInRoom=true;
                break;
            }
        }
        if(!studentInRoom){
            System.out.println("Student befindet sich nicht in diesem Raum!");
        }
    }

    public int freeSeats(){
        int availableSeats = 0;
        for(int i = 0; i<this.occupants.length;i++){
            if(this.occupants[i]== null){
                availableSeats++;
            }
        }
        return availableSeats;
    }
}
