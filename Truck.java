public class Truck extends Vehicle implements PetrolVehicle,OnStreet{
    //DATA make model speed
    public int weight;

    @Override
    public int refuel() {
        return 140;
    }

    public Truck(String make, String model, int speed, int weight) {
        super(make, model, speed);
        this.weight = weight;
    }
}
