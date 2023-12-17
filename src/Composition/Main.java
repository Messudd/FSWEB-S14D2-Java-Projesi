package Composition;

public class Main {
    public static void main(String[] args) {
        Bed bedOne = new Bed("Tek kisilik",10,210,2,1);
        Carpet carpet = new Carpet(3,2,PaintColor.RED);
        Ceiling ceiling = new Ceiling(5,PaintColor.WHITE);
        Lamp lamp = new Lamp(LampType.PENDANTS,true,8);
        Wall wallOne = new Wall("left");
        Wall wallTwo = new Wall("Right");
        Wall wallThree = new Wall("Front");
        Wall wallFour = new Wall("Back");
        Wardrobe wardrobe = new Wardrobe(2,3,120.35);

        Bedroom bedroom = new Bedroom("MyRoom",wallOne,wallTwo,wallThree,wallFour,ceiling,bedOne,lamp,wardrobe,carpet);

        System.out.println(bedroom);
        System.out.println("************************************************************");

        System.out.println("Bed : " + bedroom.getBed());
        System.out.println("Wardrop : " + bedroom.getWardrobe());
        System.out.println("Name : " + bedroom.getName());
        System.out.println("Carpet : " + bedroom.getCarpet());
        System.out.println("Ceiling : " + bedroom.getCeiling());
        System.out.println("Lamp : " + bedroom.getLamp());
        System.out.println("Lamp : " + bedroom.getWall1());
        System.out.println("Lamp : " + bedroom.getWall2());
        System.out.println("Lamp : " + bedroom.getWall3());
        System.out.println("Lamp : " + bedroom.getWall4());
        System.out.println("Carpet - color : " + bedroom.getCarpet().getColor());
        System.out.println("Carpet - width : " + bedroom.getCarpet().getWidth());
        System.out.println("Carpet - height : " + bedroom.getCarpet().getHeight());
        System.out.println("Ceiling - paintedColor : " + bedroom.getCeiling().getPaintedColor());
        System.out.println("Ceiling - height : " + bedroom.getCeiling().getHeight());
        bedroom.getCeiling().create();
        System.out.println("Lamp - battery : " + bedroom.getLamp().isBattery());
        System.out.println("Lamp - globalRating : " + bedroom.getLamp().getGlobRating());
        System.out.println("Lamp - style : " + bedroom.getLamp().getStyle());
        bedroom.getLamp().turnOn();
        System.out.println("Wall - Direction : " + bedroom.getWall1().getDirection());
        bedroom.getWall1().create();
        System.out.println("Wardrop-getter-width : "+ bedroom.getWardrobe().getWidth());
        System.out.println("Wardrop-getter-height : "+ bedroom.getWardrobe().getHeight());
        System.out.println("Wardrop-getter-weight : "+ bedroom.getWardrobe().getWeight());
        bedroom.getWardrobe().add();

        System.out.println("*****************************************************");











    }
}