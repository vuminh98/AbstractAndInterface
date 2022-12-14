package bai3;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double size) {
        super(size,size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

public double getSize() {
        return this.getWidth();
}

public void setSize(double size) {
        this.setWidth(size);
        this.setLength(size);
}

@Override
    public String toString() {
        return "A Square with size = "
                + this.getSize()
                +", which is a subclass of "
                + super.toString();
}
@Override
    public void resize(double percent) {
        double size = getSize() * (percent / 100);
        setSize(size);
}
}
