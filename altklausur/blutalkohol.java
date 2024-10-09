package altklausur;

public class blutalkohol {
    public static void main(String[] args) {
        double epsilon = 10.0e-6;
        double alkmasse = berechneMasse(20, 0.65);
        System.out.println(alkmasse);
        double alkkonzentration = berechneAlkKonzentration(alkmasse, 70, 'm');

        if(alkkonzentration-0.5 >= epsilon){
            System.out.println("Sie dürfen kein Auto mehr fahren!!!");
        }
        else if(alkkonzentration-0.5<epsilon && alkkonzentration-0.3>=epsilon){
            System.out.println("Sie sollten kein Auto mehr fahren!!!");
        }
    }

    public static double berechneMasse(double volumen, double volAlk){
        double p = 0.8;

        return volumen*volAlk*p;
    }

    public static double berechneAlkKonzentration(double alkoholmasse, double m, char typ){
        double r;
        if(typ == 'm'){
            r = 0.7;
        }
        else if (typ == 'w'){
            r = 0.6;
        }
        else if (typ == 'j'){
            r= 0.5;
        }
        else{
            System.err.println(typ + " ist kein gültiger Typ/ gültiges Geschlecht");
            return -1.0;
        }

        double value = alkoholmasse/(m*r);
        return value;



    }
}
