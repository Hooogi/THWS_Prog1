    package klausur_SS020;

    public class knoten_main {

        knotenklasse last;

        public void einfuegen(knotenklasse knoten){
            if(last == null){
                last = knoten;
            }
            else{
                knoten.vorgaenger = this.last;
                last = knoten;
            }
        }

        @Override
        public String toString(){
            knotenklasse temp = this.last;
            String string_list = "";
            while(temp != null){
                string_list+= temp.name;
                if(temp.vorgaenger != null){
                    string_list += " ";
                }
            }
            return string_list;
        }
    }
