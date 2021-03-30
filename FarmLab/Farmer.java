package FarmLab;

public class Farmer extends Person implements IEater, IBotanist, INoisemaker, IRider {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(EdibleObject edibleObject) {
        System.out.println(getClass().getSimpleName() + " is eating a " + edibleObject.getName());
    }

    public void makeNoise(String noise) {
        System.out.println("farmer says " +noise);
    }

    public void mount(RideableObject rideableObject) {
        System.out.println(getClass().getSimpleName() + " mounted the " + rideableObject.getName());
    }

    public void dismount(RideableObject rideableObject) {

        System.out.println(getClass().getSimpleName() + " dismounted the " + rideableObject.getName());
    }

    public void plantCrop(Crop crop, CropRow cropRow) {
        System.out.println("Farmer has planted " + crop.getName() + " into " + cropRow.getName());
    }
}
