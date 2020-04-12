public class circle {
    double RADIOUS;
    public circle(double radious){
        this.RADIOUS = radious;
    }
    private double setRadious(double newradious){
        RADIOUS = (newradious >= 0)? newradious:0;
        return RADIOUS;
    }
    public double getArea(){
        setRadious(-7);
        return RADIOUS * RADIOUS * Math.PI;
    }
    public static void main(String[] args) {
        circle c1 = new circle(4);
        System.out.println(c1.getArea());
    }
}
