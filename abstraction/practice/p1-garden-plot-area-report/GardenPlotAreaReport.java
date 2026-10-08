abstract class Plot {
    protected String owner;

    public Plot(String owner) {
        this.owner = owner;
    }

    public abstract double getArea();

    public abstract String getShape();

    public String getOwner() {
        return owner;
    }
}

class CirclePlot extends Plot {
    private double radius;

    public CirclePlot(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getShape() {
        return "CIRCLE";
    }
}

class RectanglePlot extends Plot {
    private double length;
    private double width;

    public RectanglePlot(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String getShape() {
        return "RECTANGLE";
    }
}

class TrianglePlot extends Plot {
    private double base;
    private double height;

    public TrianglePlot(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public String getShape() {
        return "TRIANGLE";
    }
}

public class GardenPlotAreaReport {
    public static void main(String[] args) {
        Plot[] plots = new Plot[3];
        plots[0] = new CirclePlot("Asha", 5);
        plots[1] = new RectanglePlot("Ravi", 4, 6);
        plots[2] = new TrianglePlot("Neha", 10, 3);
        double total = 0;
        for (Plot p : plots) {
            double area = p.getArea();
            System.out.printf("%s (%s): %.2f%n", p.getOwner(), p.getShape(), area);
            total += area;
        }
        System.out.printf("Total Area: %.2f%n", total);
    }
}
