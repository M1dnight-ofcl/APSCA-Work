//https://minich.com/education/wyo/java/worksheets/Complete%20the%20Class%20Worksheet%204.pdf
public class Rectangle
{
    public Rectangle(){myWidth=2;myLength=1;}
    public Rectangle(double width,double length){
        myWidth=width;
        myLength=length;
    }
    public double getWidth(){return myWidth;}
    public void setWidth(double width){myWidth=width;}
    public double getLength(){return myLength;}
    public void setLength(double length){myLength=length;}
    public double computeArea(){return(myWidth*myLength);}
    public double computePerimeter(){return(myWidth*2)+(myLength*2);}
    private double myWidth;
    private double myLength;
} 