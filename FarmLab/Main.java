package FarmLab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //CAESAR
        EdibleObject edibleEgg = new EdibleObject();
        edibleEgg.setName("edibleEgg");

        Person person = new Person();
        person.setName("person");

        Chicken chicken = new Chicken();
        chicken.setName("chicken");

        EdibleObject tomato = new EdibleObject();
        tomato.setName("tomato");
        EdibleObject earCorn = new EdibleObject();
        earCorn.setName("earCorn");

        Crop corn = new Crop();
        corn.setName("corn");
        Crop tomatos = new Crop();
        tomatos.setName("tomato");
        TomatoPlant tomatoPlant = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();


        CropRow cropRow = new CropRow();
        cropRow.setName("cropRow");

        Farmer farmer = new Farmer();
        farmer.setName("farmer");


        RideableObject horse = new RideableObject();
        horse.setName("horse");

        Field field = new Field();

        Farm farm = new Farm();
        farm.setName("farm");
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.setName("chickenCoop");
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.setName("farmHouse");
        Stable stable = new Stable();
        stable.setName("stable");

        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //horse making noise
        horse.makeNoise("neigh, neigh");

        //horse eating
        horse.eat(earCorn);

        //horse is rideable
        horse.ride(farmer);

        //chicken making noise
        chicken.makeNoise("cah, cah");

        //chicken eating
        chicken.eat(tomato);

        //chicken yielding egg
        chicken.yield(false, edibleEgg);

        //rider mounting and dismounting
        farmer.mount(horse);
        farmer.dismount(horse);

        //botanist planting crop in croprow
        farmer.plantCrop(corn,cropRow);

        //crop row stores crop
        /*cropRow.store(corn);

        //field stores croprow
        field.store(cropRow);*/

        //tractor operating on a farm
        tractor.operate(farm);

        //tractor harvesting crop
        tractor.harvest(corn);

        //cropduster operating on a farm
        cropDuster.operate(farm);

        //cropduster flying
        cropDuster.fly(farmer);

        //cropduster fertilizing croprow
        cropDuster.fertilize(cropRow);

        //cornstalk yielding earcorn
        cornStalk.yield(false,true, earCorn);

        //tomato plant yielding tomato
        tomatoPlant.yield(false,true,tomato);

        //farmer is a eater,rider,botanist,person
        farmer.eat(earCorn);
        farmer.mount(horse);
        farmer.dismount(horse);
        farmer.plantCrop(corn,cropRow);
        farmer.makeNoise("hello");

        //stable storing horses
        //stable.store(horse);

        //farmhouse storing person
        farmHouse.store(person);

        //chickencoop storing chicken
        /*chickenCoop.store(chicken);

        //farm stores stable, chickencoop, farmhouse
        farm.store(stable,chickenCoop,farmHouse);*/

        //KAM

        //MYLES
        System.out.print("\n");
        Farm newFarm = new Farm();
        newFarm.setName("farm");

        //Field
        ArrayList<CropRow> cropRows = new ArrayList<>();
        Field fieldA = new Field();
        for(int i = 0; i < 5; i++){
            switch (i){
                case 0:
                    CropRow newCorn = new CropRow();
                    newCorn.store("corn");
                    cropRows.add(newCorn);
                    break;
                case 1:
                    CropRow newTomato = new CropRow();
                    newTomato.store("tomato");
                    cropRows.add(newTomato);
                    break;
                case 2:
                    CropRow potato = new CropRow();
                    potato.store("potato");
                    cropRows.add(potato);
                    break;
                case 3:
                    CropRow pumpkin = new CropRow();
                    pumpkin.store("pumpkin");
                    cropRows.add(pumpkin);
                    break;
                case 4:
                    CropRow beets = new CropRow();
                    beets.store("beets");
                    cropRows.add(beets);
                    break;
            }
        }
        fieldA.field(cropRows);
        System.out.println("Our field has " + fieldA.getField().toString());

        //ChickenCoops
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();
        ChickenCoop coopA = new ChickenCoop();
        ChickenCoop coopB = new ChickenCoop();
        ChickenCoop coopC = new ChickenCoop();
        ChickenCoop coopD = new ChickenCoop();
        for(int i = 0; i <= 15; i++){
            Chicken newChicken = new Chicken();
            newChicken.setName("chicken "+i);
            chickens.add(newChicken);
        }
        coopA.store(chickens.subList(0,4));
        System.out.println("Chickens in coop 1: " + coopA.getChickens().toString());
        chickenCoops.add(coopA);
        coopB.store(chickens.subList(4,8));
        System.out.println("Chickens in coop 2: " + coopB.getChickens().toString());
        chickenCoops.add(coopB);
        coopC.store(chickens.subList(8,12));
        System.out.println("Chickens in coop 3: " + coopC.getChickens().toString());
        chickenCoops.add(coopC);
        coopD.store(chickens.subList(12,15));
        System.out.println("Chickens in coop 4: " + coopD.getChickens().toString());
        chickenCoops.add(coopD);

        //Stables
        ArrayList<Stable> stables = new ArrayList<>();
        ArrayList<Horse> horses  = new ArrayList<>();
        Stable stableA = new Stable();
        Stable stableB = new Stable();
        Stable stableC = new Stable();
        for(int i = 0; i <= 9; i++){
            Horse newHorse = new Horse();
            newHorse.setName("horse "+i);
            horses.add(newHorse);
        }
        stableA.store(horses.subList(0,4));
        System.out.println("Horses in stable 1: " + stableA.getHorses().toString());
        stables.add(stableA);
        stableB.store(horses.subList(4,8));
        System.out.println("Horses in stable 2: " + stableB.getHorses().toString());
        stables.add(stableB);
        stableC.store(horses.subList(8,10));
        System.out.println("Horses in stable 3: " + stableC.getHorses().toString());
        stables.add(stableC);

        //Add to farm
        ArrayList<Vehicle> vehicles = new ArrayList<>(); //Create two vehicles
        Vehicle vehicleA = new Vehicle();
        vehicles.add(vehicleA);
        Vehicle vehicleB = new Vehicle();
        vehicles.add(vehicleB);
        Aircraft aircraft = new Aircraft(); //Create aircraft
        Frolinda frolinda = new Frolinda();

        newFarm.store(fieldA, chickenCoops,stables, vehicles, aircraft, frolinda);
        System.out.println("Farm has a " + fieldA.getClass().getSimpleName() + ", " + chickenCoops.size() + " chickenCoops, " + stables.size() + " stables, " + vehicles.size() + " vehicles, and a " + aircraft.getClass().getSimpleName() + ". His sister, " + frolinda.getClass().getSimpleName() + " lives there.");

        //Add farm to Froilan
        Frolian frolian = new Frolian();
        frolian.owns(newFarm);
        System.out.println(frolian.getClass().getSimpleName() + " has a " + newFarm.getName());
    }
}
