package FarmLab;

public class Person implements INoisemaker, IEater{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public void eat(EdibleObject edibleObject) {

    }


    @Override
    public void makeNoise(String noise) {

    }
}
