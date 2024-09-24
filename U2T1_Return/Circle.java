package U2T1_Return;

public class Circle {
    private double radius;

    public Circle(double circleRadius){
        radius = circleRadius;
    }
    public void printArea(){
        double area = Math.PI * (radius*radius);
        System.out.println(area);
    }
}
