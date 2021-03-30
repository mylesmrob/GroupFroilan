package FarmLab;

import java.util.List;

public class ChickenCoop {
    private String name;
    private List<Chicken> chickens;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void store(List<Chicken> chickens) {
        this.chickens = chickens;
    }
}
