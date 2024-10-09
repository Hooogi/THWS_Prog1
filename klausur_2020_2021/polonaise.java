    package klausur_2020_2021;

    public class polonaise {

        Roboter start;

        public polonaise(){
            this.start = null;
        }

        public void anhaengen(Roboter roboter){
            Roboter temp = start;
            if(this.start == null){
                start = roboter;
            }
            while(temp!=null){
                if(temp.successor.getHeight()> roboter.getHeight()){
                    roboter.successor = temp.successor;
                    temp.successor = roboter;
                }
                else {
                    temp = temp.successor;
                }
            }
        }

        public void vorstellen(){
            Roboter temp = start;
            while(temp!=null){
                System.out.println(temp.toString());
                temp = temp.successor;
            }
        }
    }
