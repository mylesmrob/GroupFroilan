package FarmLab;

public class FarmHouse{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void store(Person person){
        System.out.println(getClass().getSimpleName() + " stores " + person.getName());
    }

}
