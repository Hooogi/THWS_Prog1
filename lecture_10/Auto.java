package lecture_10;

public class Auto {

    int serialnumber;
    String model;
    int productionyear;
    int ccm;

    static int count = 0;

    public Auto(int serialnumber, String model, int productionyear, int ccm){
        this.serialnumber = serialnumber;
        this.model = model;
        this.productionyear = productionyear;
        count++;
    }

}
