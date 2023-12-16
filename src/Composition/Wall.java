package Composition;

public class Wall {
    private  String direction;

    public  Wall(String direction) {
        this.direction = direction;
    }
    public String getDirection() {
        return  direction;
    }
    public void create() {
        System.out.println("Wall object created with " + direction+ ".");
    }
    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
