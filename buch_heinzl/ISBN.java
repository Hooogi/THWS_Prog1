package buch_heinzl;

public class ISBN {

    String isbn;

    public ISBN(String isbn){
        if(checkISBN(isbn)){
            this.isbn = isbn;
        }
        else{
            System.err.println("Ungültige ISBN - Es wurde kein Objekt der Klasse ISBN angelegt.");
        }
    }

    private int[] convertToIntArray(String isbn){
        int[] isbn_array = new int[10];

        if(isbn.length() > 13){
            System.err.println("Ungültige ISBN!");
            return null;
        }
        else{
            for(int i = 0, j = 0; i<isbn.toCharArray().length; i++){
                if(isbn.charAt(i) >= '0' && isbn.charAt(i)<= '9'){
                    isbn_array[j] = isbn.charAt(i);
                    j++;
                }
            }
        }
        return isbn_array;
    }

    private boolean checkISBN(String isbn){
        int[] isbn_array = convertToIntArray(isbn);
        int sum = 0;
        for(int i = 0, k = 1; i< isbn_array.length; i++, k++){
            sum += isbn_array[i] * k;
        }
        if(sum%11==0){
            System.out.println("Gültige ISBN - Objekt erstellt");
            return true;
        }
        else{
            return false;
        }
    }
}
