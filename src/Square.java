public class Square extends Rectangle{
    int size = 2;
    public Square (){

    }

    public Square(int size ){
        super(size, size);
    }

    public Square(String color, Boolean filled, int size) {
        super(color, filled, size, size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + getSize() +

                ", which is a subclass of=" + super.toString() +
                '}';
    }
}
