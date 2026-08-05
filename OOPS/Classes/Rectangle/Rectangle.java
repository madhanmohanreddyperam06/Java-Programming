class Rectangle {
    double length;
    double breadth;
    double height;

    Rectangle() {
    }

    double findArea() {
        return length * breadth;
    }

    double findArea3D() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}