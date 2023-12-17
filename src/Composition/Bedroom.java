package Composition;

public class Bedroom extends Room{
    private  Bed bed;
    private Wardrobe wardrobe;
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name,wall1,wall2,wall3,wall4,ceiling,lamp,carpet);
        this.bed = bed;
        this.wardrobe = wardrobe;
    }
    public Bed getBed() {
        return bed;
    }
    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return super.toString() +" Bedroom { " +
                " bed= " + bed +
                ", wardrobe= " + wardrobe + " " +
                '}';
    }
}
