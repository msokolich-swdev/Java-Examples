public class Scooter implements Vehicle {
    private VehicleType type;

    public Scooter(VehicleType type) {
        this.type = type;
    }

    public VehicleSize getSize() {
        return VehicleSize.SMALL;
    }

    public VehicleType getType() {
        return type;
    }
}