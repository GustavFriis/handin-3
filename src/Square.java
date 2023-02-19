public class Square implements Comparable<Square> {
    double width;
    double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return this.width * 2 + this.height * 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int compareTo(Square comparingPerimeter) {
        if (this.perimeter() > comparingPerimeter.perimeter()) {
            return -1;
        } else {
            return 1;
        }
    }
}
