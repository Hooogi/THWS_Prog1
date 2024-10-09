package klausur_SS020;

public class flatten_klasse {
    public static void main(String[] args) {
        int[][] test = {{1,2,3,4,5},{6},{7,8},{9,10,11,12}};
        int [] flat_test = flatten(test);
        for(int x : flat_test){
            System.out.println(x);
        }
    }

        public static int[] flatten(int[][] array2Dim){
            int space = 0;
            for(int i = 0; i<array2Dim.length; i++){
                space += array2Dim[i].length;
            }
            int[] flat_array = new int[space];
            int index = 0;
            for(int i = 0; i< array2Dim.length;i++){
                for(int j = 0; j< array2Dim[i].length; j++){
                    flat_array[index]=array2Dim[i][j];
                    index++;
                }
            }
            return flat_array;
        }
    }
