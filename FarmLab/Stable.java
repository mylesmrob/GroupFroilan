package FarmLab;

import java.util.List;

public class Stable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public void store(List<Horse> horses){
        this.horses = horses;
    }
}
