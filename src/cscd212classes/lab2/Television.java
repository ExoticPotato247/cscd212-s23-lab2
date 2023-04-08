package cscd212classes.lab2;

import java.util.Objects;

public class Television implements Comparable<Television> {
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(String model, boolean smart, int screenSize, int resolution, String make) {
        if(model == null || model.isEmpty() || make == null || make.isEmpty() || screenSize < 32 || resolution < 720){
            throw new IllegalArgumentException("Invalid parameter in constructor");
        }
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
        this.fourK = resolution == 2160;
    }

    public Television(String make, String model, boolean smart, int screenSize, int resolution) {
        this(model, smart, screenSize, resolution, make);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        String tele = this.make + "-" + this.model + ", " + this.screenSize + " inch";
        if(this.smart == true){
            tele =  tele + " smart";
        }
        tele = tele + " tv";

        if(this.fourK == true){
            tele = tele + " with 4K resolution";
        }
        else{
            tele = tele + " with " + resolution + " resolution";
        }
        return tele;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Television that)) return false;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return String.valueOf(this.make).hashCode() + String.valueOf(this.model).hashCode() + this.resolution + Boolean.hashCode(this.smart) + Boolean.hashCode(this.fourK);
    }


    @Override
    public int compareTo(Television o) {
        if (o == null){
            throw new IllegalArgumentException("null parameter in the compareTo method");
        }
        if(this.getMake().compareTo(o.getMake()) == 0){
            if(this.getModel().compareTo(o.getModel()) == 0){
                return (this.getScreenSize() - o.getScreenSize());
            }
            return this.getModel().compareTo(o.getModel());
        }
        return this.getMake().compareTo(o.getMake());
    }

}
