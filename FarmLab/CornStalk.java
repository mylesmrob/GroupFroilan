package FarmLab;

public  class CornStalk extends Crop {

    public void yield(boolean hasBeenFertilized, boolean hasBeenHarvested, EdibleObject earCorn) {

        if (hasBeenFertilized == false && hasBeenHarvested == true) {
            System.out.println(getClass().getSimpleName() + " yielded a " + earCorn.getName());
        } else {
            System.out.println(getClass().getSimpleName() + " did not yield anything");
        }

    }

}
