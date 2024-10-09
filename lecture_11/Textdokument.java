package lecture_11;

public class Textdokument {

    public static void main(String[] args) {
        char[][] document = new char[3][];
        String s = "Hallo Welt!"; //10
        document[0] = s.toCharArray();
        document[1] = null;
        String h = "Wie geht es dir?"; //13
        document[2] = h.toCharArray();
        printRow(document);
        System.out.println("---------");
        char[][] doc2 = new char[2][];
        String a = "Tom";
        String b = "Hogrefe";
        doc2[0]= a.toCharArray();
        doc2[1]= b.toCharArray();

        document = insertDoc(document,doc2,1);
        printRow(document);
    }
    // noch einmal objektbaisert schreiben!
    public int countChars(char[][] doc){
        int count = 0;
        for(int i = 0; i<doc.length;i++){
            if(doc[i] != null){
                for(char c : doc[i]){
                    if(c != ' '){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean swapRows(char[][]doc, int a, int b){
        if((a >= 0 && b >=0)&&(a<doc.length && b<doc.length)){
            char[] copy = doc[b];
            doc[b] = doc[a];
            doc[a] = copy;

            return true;
        }
        else{
            return false;
        }
    }

    public static char[][] insertDoc(char[][] doc, char[][] doc2, int a){
        if(a>= 0 && a<doc.length){
            char[][] newDoc = new char[doc.length+doc2.length][];
            int index = 0;
            for(int i = 0; i< a; i++){
                newDoc[i] = doc[i];
            }
            for(int i = 0, x = a; i<doc2.length; i++, x++){
                newDoc[x] = doc2[i];
            }
            for(int i = a, x = a+doc2.length; i < doc.length; i++, x++){
                newDoc[x]= doc[i];
            }
            return newDoc;
        }
        else {
            throw new RuntimeException("Ungültige Zeilenangabe");
        }
    }

    public static void printRow(char[][] doc){
        for(char[] array : doc){
            if(array != null){
                System.out.println(String.valueOf(array));
            }
            else{
                System.out.println("");
            }
        }
    }
}
