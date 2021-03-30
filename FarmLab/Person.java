package FarmLab;

public class Person implements INoisemaker, IEater{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println(getClass().getSimpleName() + "eats ");
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println(getClass().getSimpleName() + " goes lol");
    }
}
