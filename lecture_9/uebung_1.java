package lecture_9;

public class uebung_1 {
    public static void main(String[] args) {
        Raum audimax = new Raum("Audimax", 250);

        System.out.println(audimax.getOccupied());

        audimax.setOccupied(true);

        System.out.println(audimax.getOccupied());
    }
}
