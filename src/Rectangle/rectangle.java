package Rectangle;

public class rectangle {
    public double widht;
    public double height;

    public double area(){
        double area = widht*height;
        return area();
    }
    public double perimeter(){
        double perimeter = 2*(height*widht);
        return  perimeter();
    }
    public double diagonal(){
        double diagonal = Math.sqrt(Math.pow(height, 2)+ Math.pow(widht, 2));
        return  diagonal;
    }
}
