package FarmLab;

public abstract class Animal implements INoisemaker, IEater {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void eat(EdibleObject edibleObject) {
        System.out.println("Default animal eats " + edibleObject.getName());
    }

    public void makeNoise(String noise) {
        System.out.println("Default animal says " + noise);
    }
}
