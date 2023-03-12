public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println(sh);
        Shape sh1 = new Shape("red", false);
        System.out.println(sh1);
        Circle c = new Circle();
        System.out.println(c);
        Circle c1 = new Circle(3);
        System.out.println(c1);
        Circle c2 = new Circle("info",true,8);
        System.out.println(c2);
        Rectangle r = new Rectangle();
        System.out.println(r);
        Rectangle r1 = new Rectangle(6,3);
        System.out.println(r1);
        Rectangle r2 = new Rectangle("orange",true,6,9);
        System.out.println(r2);
        Square sq = new Square();
        System.out.println(sq);
        Square sq1 = new Square(4);
        System.out.println(sq1);
        Square sq2 = new Square("black",false,6);
        System.out.println(sq2);
    }
}