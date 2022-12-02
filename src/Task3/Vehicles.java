package Task3;

import java.util.SortedMap;

public enum Vehicles {
    TOYOYTA(3000.00){
        @Override
        public String getColor(){
            return "Yellow";
        }
    },
    BMW(5000.25){
        @Override
        public String getColor(){
            return "Red";
        }
    },
    MERCEDES(7265.99){
        @Override
        public String getColor(){
            return "Black";
        }
    };

    public abstract String getColor();


    double price;
    Vehicles(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return super.toString() + " " + getColor() + "-" + price + "$";
    }
}

class Main{

    public static void main(String[] args) {
        Vehicles car1 = Vehicles.BMW;
        Vehicles car2 = Vehicles.MERCEDES;
        Vehicles car3 = Vehicles.TOYOYTA;
        System.out.println(car1.toString() + "\n" + car2.toString() + "\n" + car3.toString());
    }
}
