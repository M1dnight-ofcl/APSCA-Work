//https://minich.com/education/wyo/java/worksheets/Complete%20the%20Class%20Worksheet%203.pdf
public class Circle
{
    public Circle(){myRadius=5;}
    public Circle(double rad){myRadius=rad;}
    public double getRadius(){return myRadius;}
    public void setRadius(double rad){myRadius=rad;}
    public double computeArea(){return PI*Math.pow(myRadius,2);}
    public double computeCircumference(){return PI*(2*myRadius);}
    private double myRadius;
    public static final double PI=3.14;
} 