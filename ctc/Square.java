//https://minich.com/education/wyo/java/worksheets/Complete%20the%20Class%20Worksheet%202.pdf
public class Square{
    public Square(){myWidth=2;}
    public Square(double width){myWidth=width;}
    public double getWidth(){return myWidth;}
    public void setWidth(double width){myWidth=width;}
    public double computeArea(){return Math.pow(myWidth,2);}
    public double computePerimeter(){return myWidth*4;}
    private double myWidth;
} 