package lecture_11.raum;

public class Raumbelegung {
    public static void main(String[] args) {
        Raum Audimax = new Raum("Audimax", 4, 10);
        Raum I22 = new Raum("I22", 8,6, 4);
        System.out.println(Audimax.freeSeats());

        Student Lukas = new Student("Lukas",42069);
        Student Denis = new Student("Denis", 69420);
        Student Tom = new Student("Tom", 1337);
        Audimax.betreteRaum(Lukas);
        Audimax.betreteRaum(Denis);
        Audimax.betreteRaum(Tom);

        System.out.println(Audimax.freeSeats());
        System.out.println(Audimax.createCurrentRoomPlan(true));
        System.out.println(I22.createCurrentRoomPlan(true));

        System.out.println(Audimax.freeSeats());
    }
}
