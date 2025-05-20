class Shape {
    void draw() {
        System.out.println("drawing shape");
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("calculating area of circle");
    }
}

class shapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.calculateArea();
    }
}
