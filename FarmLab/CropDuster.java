package FarmLab;

public class CropDuster extends Aircraft implements IFarmvehicle, IFly{


    public void fly(Farmer farmer) {
        System.out.println(farmer.getName() + " is flying the " + getClass().getSimpleName());

    }

    public void fertilize(CropRow cropRow){

        System.out.println(getClass().getSimpleName() + " is fertilizing " + cropRow.getName());

    }

    public void ride(Farmer farmer) {
        System.out.println(farmer.getName() + " is riding the " + getClass().getSimpleName());
    }

    public void harvest(Crop crop) {
        System.out.println(getClass().getSimpleName() + " is harvesting " + crop.getName());

    }



    @Override
    public void operate(Farm farm) {
        System.out.println(getClass().getSimpleName() + " is operating on the " + farm.getName());

    }


}
