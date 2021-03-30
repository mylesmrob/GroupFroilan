package FarmLab;

public class Frolinda extends Farmer implements IPilot, IEater{

    @Override
    public void uses(CropDuster cropDuster) {
        System.out.println("Frolinda is using the " + cropDuster);

    }

    @Override
    public void eat(EdibleObject edible) {
        System.out.println(getClass().getSimpleName() + "eats " + edible.getName());
    }

}
