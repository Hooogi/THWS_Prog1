package lecture_10;

public class Raumbelegung {
    public static void main(String[] args) {
        Raum Audimax = new Raum("Audimax",250);

        System.out.println(Audimax.freeSeats());

        Student Lukas = new Student("Lukas",42069);
        Student Denis = new Student("Denis", 69420);
        Audimax.betreteRaum(Lukas);
        Audimax.betreteRaum(Denis);

        System.out.println(Audimax.freeSeats());

        Audimax.verlasseRaum(Denis);

        System.out.println(Audimax.freeSeats());
    }
}
