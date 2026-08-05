class Rectangle1 {
    double length;
    double breadth;
    double height;

    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle1(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double area() {
        return length * breadth;
    }

    double area3D() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}