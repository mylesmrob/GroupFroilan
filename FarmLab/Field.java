package FarmLab;

import java.util.ArrayList;

public class Field extends Farm {
    private ArrayList<CropRow> cropRows;

    public void field(ArrayList<CropRow> cropRows){
        this.cropRows = cropRows;
    }

    public ArrayList<CropRow> getField() {
        return cropRows;
    }
}
