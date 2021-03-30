package FarmLab;

public class RideableObject extends Horse implements IRideable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(EdibleObject edibleObject) {
        System.out.println( "Horse is eating a " + edibleObject.getName());
    }

    @Override
    public void ride(Farmer farmer) {

    }


}


