package FarmLab;

public class Frolinda extends Farmer implements IPilot{






    @Override
    public void uses(CropDuster cropDuster) {
        System.out.println("Frolinda is using the " + cropDuster);

    }

}
