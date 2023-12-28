package pavlova.tatiana.lessons;

public class Park {

    public static class Attractions {
        private String name;

        private String time;

        private double cost;

        public Attractions(String name, String time, int cost) {

            this.name = name;

            this.time = time;

            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attractions attraction1 = new Park.Attractions("Аттракцион 1", "09:00 - 21:00", 300);

        Park.Attractions attraction2 = new Park.Attractions("Аттракцион 2", "08:00 - 20:00", 500);


        System.out.println(attraction1.getName());

        System.out.println(attraction2.getCost());


        attraction1.setName("New name");

        System.out.println(attraction1.getName());
    }
}


