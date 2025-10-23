//https://minich.com/education/wyo/java/worksheets/Complete%20the%20Class%20Worksheet%201.pdf
public class Tank {
    public Tank(){
        myAmmo=0;
        myX=0;
        myY=0;
    }
    public Tank(int ammo, int x, int y){
        myAmmo=ammo;
        myX=x;
        myY=y;
    }
    public int getAmmo(){return myAmmo;}
    public int getX(){return myX;}
    public int getY(){return myY;}
    public void setAmmo(int ammo){myAmmo=ammo;}
    public void setX(int x){myX=x;}
    public void setY(int y){myY=y;}
    private int myAmmo;
    private int myX;
    private int myY;
} 