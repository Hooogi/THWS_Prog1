package altklausur;

public class test_varargs {

    double[] koeffizienten;
    String Polynom;

    public test_varargs(double... x){
        this.Polynom ="";
            for(int i = 0; i<x.length;i++){
                if(i== x.length-1){
                    this.Polynom+=x[i];
                }
                else {
                    this.Polynom+= x[i]+"*x^"+(x.length-(i+1));
                }
            }
    }
}
