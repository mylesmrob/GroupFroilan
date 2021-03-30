package FarmLab;

public class TomatoPlant extends Crop {

    public void yield(boolean hasBeenFertilized, boolean hasBeenHarvested, EdibleObject tomato) {

        if (hasBeenFertilized == false && hasBeenHarvested == true) {
            System.out.println(getClass().getSimpleName() + " Tomato plant yielded a " + tomato.getName());
        } else {
            System.out.println(getClass().getSimpleName() + " did not yield anything");
        }

    }

}
