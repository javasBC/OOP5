public class Bike extends  Vehicle implements ElectricVehicle,OnStreet{
    //DATA make model speed
    public boolean hellmet;

    @Override
    public int charge() {
        return 226;
    }

    public Bike(String make, String model, int speed, boolean hellmet) {
        super(make, model, speed);
        this.hellmet = hellmet;
    }
}
