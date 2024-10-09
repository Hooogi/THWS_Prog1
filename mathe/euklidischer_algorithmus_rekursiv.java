package mathe;

public class euklidischer_algorithmus_rekursiv {

    public static euklid_row ggT(int x, int y){
        int temp;
        if(y>x){
            temp = y;
            y = x;
            x = temp;
        }
        euklid_row i = new euklid_row(1,0,x);
        euklid_row ii = new euklid_row(0,1,y);

        return ggT_rekursiv(i,ii);
    }

    public static euklid_row ggT_rekursiv(euklid_row i, euklid_row ii){
        int q = i.r / ii.r;
        if(i.r - (q*ii.r)==0){
            return ii;
        }
        else{
            i = new euklid_row(i.z-q*ii.z,i.y-q*ii.y,i.r-q*ii.r);
            return ggT_rekursiv(ii,i);
        }
    }
}
