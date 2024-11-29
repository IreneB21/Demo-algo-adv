package fr.eql.ai116.algo.adv.tp.astronomy;

public class CelestialObject {
    private String name;
    private int diameter;
    private String type;
    private String orbit;

    public CelestialObject(String name, int diameter, String type, String orbit) {
        this.name = name;
        this.diameter = diameter;
        this.type = type;
        this.orbit = orbit;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getType() {
        return type;
    }

    public String getOrbit() {
        return orbit;
    }

    @Override
    public String toString() {
        return "CelestialObject{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                ", type='" + type + '\'' +
                ", orbit='" + orbit + '\'' +
                '}';
    }
}
