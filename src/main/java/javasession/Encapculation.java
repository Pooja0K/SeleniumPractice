package javasession;

    public class Encapculation {

        private String name = "Saket";
        private int a =10;

        public String getName() {
            return name;
        }

        public void setName(String s) {
            this.name = s;
        }

        public static void main(String[] args) {
            Encapculation e = new Encapculation();
            e.setName("Pooja");
            System.out.println(e.getName());
        }



    }

