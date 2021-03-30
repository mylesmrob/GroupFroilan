package FarmLab;

public class Tractor extends Vehicle implements IFarmvehicle{





    @Override
    public void ride(Farmer farmer) {
        System.out.println(farmer + " is riding the tractor in the field");

    }


    public void harvest(Crop crop) {
        System.out.println(getClass().getSimpleName() + " is harvesting " + crop.getName());

    }


    @Override
    public void operate(Farm farm) {
        System.out.println(getClass().getSimpleName() + " is operating on the " + farm.getName());

    }
}
