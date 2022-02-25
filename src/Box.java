public class Box {
    double width;
    double hight;
    double depth;

    public Box(double width, double hight, double depth){
        this.width = width;
        this.hight = hight;
        this.depth = depth;
    }

    public double volume(){
        return width*depth*hight;
    }
}
