package mathe;
public class euklidischer_algorithmus {

    public static euklid_row ggT(int x, int y){
        euklid_row[] rows = new euklid_row[2];

        euklid_row firstRow = new euklid_row(1,0,x);
        rows[0]=firstRow;
        euklid_row secondRow = new euklid_row(0,1,y);
        rows[1]=secondRow;

        euklid_row swap;

        while(rows[0].r != 0 && rows[1].r != 0){
            int q = rows[0].r/ rows[1].r;
            if(rows[0].r-(q*rows[1].r) == 0){
                break;
            }
            swap = rows[1];
            rows[1] = new euklid_row(rows[0].z-(q* rows[1].z),rows[0].y-(q* rows[1].y),rows[0].r-(q* rows[1].r));
            rows[0]=swap;
        }
        return rows[1];

    }
}
