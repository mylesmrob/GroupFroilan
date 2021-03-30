package FarmLab;

public abstract class Produce {

    public void yield(boolean hasBeenFertilized, boolean hasBeenHarvested, EdibleObject edibleObject) {

        if (hasBeenFertilized == false && hasBeenHarvested == true) {
            System.out.println(getClass().getSimpleName() + " yielded a " + edibleObject.getName());
        } else {
            System.out.println(getClass().getSimpleName() + " did not yield anything");
        }

    }
}
