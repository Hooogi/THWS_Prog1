package lecture_11;

public class zeilenmaxima {
    public static void main(String[] args) {
        double[][] array = {{2.3,5.3,1.5},{4.3,6.3,7.5},{3.6,1.3,2.9}};
        double[] maxima = zeilenmaxima(array);

        for(double x : maxima){
            System.out.println(x);
        }
    }

    public static double[] zeilenmaxima(double[][] array){
        double maxima;
        double[] maxVal = new double[array[0].length];
        for(int i = 0; i < array[0].length; i++){
            maxima = array[0][i];
            for(int x = 0; x < array.length; x++) {
                if (maxima < array[x][i]) {
                    maxima = array[x][i];
                }
            }
            maxVal[i] = maxima;
        }
        return maxVal;
    }
}
