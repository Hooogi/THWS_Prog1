package lecture_11.raum;

public class Raum {

    private String name;
    private int size;
    private Student[][] occupants;
    private boolean occupied;



    public Raum(String name, int rows, int seatsPerRow){
        this.name = name;
        this.size = rows * seatsPerRow;
        this.occupied = false;
        this.occupants = new Student[rows][seatsPerRow];
    }

    public Raum(String name, int rows, int seatsFirstRows, int growAt){
        this.name = name;
        this.size = 0;
        this.occupied = false;

        this.occupants = new Student[rows][];
        for(int i = 0; i<this.occupants.length; i++){
            if(i < growAt){
                this.occupants[i] = new Student[seatsFirstRows];
            }
            else{
                this.occupants[i] = new Student[this.occupants[i-1].length+2];
            }
        }

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
        boolean placedStudent = false;
        if(this.freeSeats()==0){
            System.out.println("Der Raum ist voll!");
        }
        else{
            for(int i = 0; i<this.occupants.length; i++){
                for(int x = 0; x<this.occupants[i].length; x++){
                    if(this.occupants[i][x]==null){
                        this.occupants[i][x]= student;
                        placedStudent = true;
                        break;
                    }
                }
                if(placedStudent){
                    break;
                }
            }
        }
    }

    public void verlasseRaum(Student student){
        boolean studentInRoom = false;
        for(int i = 0; i<this.occupants.length;i++){
            for(int x = 0; x<this.occupants[i].length; x++){
                if(this.occupants[i][x]==student){
                    this.occupants[i][x] = null;
                    studentInRoom=true;
                    break;
                }
            }
            if(studentInRoom){
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
            for(Student student : this.occupants[i]){
                if(student== null){
                    availableSeats++;
                }
            }
        }
        return availableSeats;
    }

    public String createCurrentRoomPlan(boolean showEmpty){
        int largestRow = this.occupants[this.occupants.length-1].length;
        String[][] roomPlanArray = new String[this.occupants.length][largestRow];

        String roomplan = this.getName() +"\n";
        for(int i = 0; i<this.occupants.length; i++){
                for (int x = 0; x < this.occupants[i].length; x++) {
                    if (this.occupants[i][x] != null) {
                        roomplan += this.occupants[i][x].getName().substring(0, 2);
                    } else if (this.occupants[i][x] == null && showEmpty) {
                        roomplan += "__";
                    }
                    roomplan += " ";
                }
                roomplan += "\n";
        }
        return roomplan;
    }
}
