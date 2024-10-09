package lecture_11;

public class ticker_test {
    public static void main(String[] args) {
        Ticker ticker = new Ticker(45);
        System.out.println(ticker.getGroesse());
        ticker.setNachricht("Wettervorhersage: Schnee in Würzburg");
        System.out.println(ticker.getNachricht());
        ticker.rotateNachricht(6);
        System.out.println(ticker.getNachricht());
    }
}
