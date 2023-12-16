package Composition;

public class Lamp {
    private LampType style;
    private  boolean battery;
    private  int globRating;

    public  Lamp(LampType style, boolean battery , int globRating){
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }
    public LampType getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
