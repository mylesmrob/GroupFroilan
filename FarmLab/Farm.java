package FarmLab;

import java.util.ArrayList;

public class Farm {
    private Field field;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private ArrayList<Vehicle> vehicles;
    private Aircraft aircraft;
    private String name;
    private Frolinda frolinda;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void store(Field field, ArrayList<ChickenCoop> chickenCoops, ArrayList<Stable> stables, ArrayList<Vehicle> vehicles, Aircraft aircraft, Frolinda frolinda){
        this.field = field;
        this.chickenCoops = chickenCoops;
        this.stables = stables;
        this.vehicles = vehicles;
        this.aircraft = aircraft;
        this.frolinda = frolinda;
    }
}
