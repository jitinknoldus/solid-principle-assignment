import java.util.Scanner;

//creating interface
interface CalculateArea
{
    int getArea();
}

//class rectangle implementing CalculateArea (interface)
class Rectangle implements CalculateArea{
    int m_width;
    int m_height;
    public void setWidth(int width){
        m_width = width;
    }
    public void setHeight(int h) {
        m_height = h;
    }
    public int getWidth() {
        return m_width;
    }
    public int getHeight() {
        return m_height;
    }
    public int getArea() {
        return m_width * m_height;
    }
}


class Square implements CalculateArea{
    int m_side;
    public void setSide(int side)
    {
        m_side=side;
    }
    public int getSide() {
        return m_side;
    }
    public int getArea() {
        return m_side*m_side;
    }
}
public class Calculation {
    public static void main(String []arg) {
        Scanner scannerObject=new Scanner(System.in);
        
        System.out.println("Enter width and height of rectangle");
        
        int widthOfRectangle=scannerObject.nextInt();
        int heightofRectangle=scannerObject.nextInt();
        System.out.println("Enter Side of a square");
        
        int sideOfSquare=scannerObject.nextInt();
        Rectangle objectOfRectangle=new Rectangle();
        objectOfRectangle.setWidth(widthOfRectangle);
        objectOfRectangle.setHeight(heightofRectangle);
        
        int areaOfRectangle=objectOfRectangle.getArea();
        System.out.println("The area of Rectangle is "+areaOfRectangle);
        
        Square objectOfSquare=new Square();
        objectOfSquare.setSide(sideOfSquare);
        int areaOfSquare=objectOfSquare.getArea();
        System.out.println("The area of Square is "+areaOfSquare);
    }
}

