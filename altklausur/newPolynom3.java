package altklausur;

public class newPolynom3 {

    double[] koeffizienten;
    int degree;

    public newPolynom3(double[] koeffizienten){
        this.koeffizienten = koeffizienten;
        this.degree = this.koeffizienten.length-1;
    }

    public double calcAtX(double x){
        double value = 0;
        int power= this.degree;
        for(double k : this.koeffizienten){
            value+=k*powerOfX(x, power);
            power--;
        }
        return value;
    }

    public newPolynom3 derivatePolynom(){
        double[] newKoeff = new double[degree];
        for(int i = 0, z = this.degree; i<newKoeff.length; i++, z--){
            newKoeff[i] = this.koeffizienten[i]*z;
        }
        return new newPolynom3(newKoeff);
    }
    private double powerOfX(double x, double exp){
        if(exp == 0){
            return 1;
        }
        else{
            return x*powerOfX(x, exp-1);
        }
    }

    @Override
    public String toString(){
      String polynom = "";
      for(int i = 0, z = degree; i< this.koeffizienten.length; i++, z--){
          if(z>1){
              polynom+= this.koeffizienten[i]+"x^"+z+"+";
          }
          else if(z==1){
              polynom+= this.koeffizienten[i]+"x+";
          }
          else {
              polynom+= this.koeffizienten[i];
          }
      }
      return polynom;
    }
    public static void main(String[] args) {
        newPolynom3 firstPolynom = new newPolynom3(new double[]{1.5,4.0,1.3,-8.0,7.5});
        System.out.println(firstPolynom.calcAtX(2));
        System.out.println(firstPolynom.toString());
        newPolynom3 secondPolynom = firstPolynom.derivatePolynom();
        System.out.println(secondPolynom.toString());
    }
}
