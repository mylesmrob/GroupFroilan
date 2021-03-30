package FarmLab;

public class CropRow{
    private String name;
    private String crop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void store(String crop){
        this.crop = crop;
    }

    @Override
    public String toString() {
        return crop;
    }

}
