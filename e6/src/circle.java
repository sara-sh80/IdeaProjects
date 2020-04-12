public class circle {
    int x;
    int y;
    int r;
    public circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public double area(){
        double s = Math.PI * (Math.pow(this.r,2));
        return s;
    }
    public double CircumFerence(){
        double p = 2 * Math.PI * (this.r);
        return p;
    }
    public double DistanceFromCenter(circle c){
        double xfactor = Math.pow(c.x - this.x , 2);
        double yfactor = Math.pow(c.y - this.y , 2);
        double d = Math.sqrt(xfactor + yfactor);
        return d;
    }
    public static void main(String[] args) {
        circle c1 = new circle(6, 3,1);
        circle c2 = new circle(3,1,2);
        System.out.println(c2.area());
        System.out.println(c1.CircumFerence());
        System.out.println(c1.DistanceFromCenter(c2));
        System.out.println(c2.DistanceFromCenter(c1));

    }
}
