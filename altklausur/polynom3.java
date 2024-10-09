package altklausur;

public class polynom3 {

    String polynom;
    double[] koeffizienten;

    public polynom3(double[] koeffizienten){
        this.koeffizienten = koeffizienten;
    }

    public double calculateX(double x){
        double value = 0;
        for(int i = 0; i<this.koeffizienten.length; i++){
            double x2 = powerOfX(x,(this.koeffizienten.length-1)-i);
            value+= this.koeffizienten[i]*x2;

        }
        return value;
    }

    public static double powerOfX(double x, int exp){
        if(exp==0){
            return 1;
        }
        else {
            return x * powerOfX(x, exp-1);
        }
    }

    public polynom3 leiteAb(){
        double[] newKoeffizienten = new double[this.koeffizienten.length-1];
        for(int i = 0; i< newKoeffizienten.length; i++){
            newKoeffizienten[i] = this.koeffizienten[i]*(newKoeffizienten.length-i+1);
        }
        polynom3 ableitung = new polynom3(newKoeffizienten);
        return ableitung;
    }

    @Override
    public String toString(){
        String polynom = "";
        for(int i = 0; i<this.koeffizienten.length; i++){
            if(i!=0){
                polynom+="+";
            }
            if(this.koeffizienten.length-(i+1)==1){
                polynom += koeffizienten[i]+"x";
            }
            else if(i == this.koeffizienten.length-1){
                polynom += koeffizienten[i];
            }
            else {
                polynom += koeffizienten[i]+"x^"+((this.koeffizienten.length-1)-i);
            }
        }
        return polynom;
    }

    public static void main(String[] args) {
        polynom3 f = new polynom3(new double[] {1.5,4,1.3,-8});
        System.out.println(f.calculateX(2));

        System.out.println(f.toString());
    }


}
