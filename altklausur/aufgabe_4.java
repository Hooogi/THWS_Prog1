package altklausur;

public class aufgabe_4 {
    public static void main(String[] args) {
        printQuadrat(10);
    }

    public static void printQuadrat(int zeilen){
        for(int i = 0; i < zeilen; i++){
            String output = "*";
            if(i==0 || i==zeilen-1){
                for(int z = 1; z<zeilen; z++){
                    output+="*";
                }
            }
            else{
                for(int z = 1; z<zeilen-1; z++){
                    output+=" ";
                }
                output+="*";
            }
            System.out.println(output);
        }
    }
}
