public class point {
    int x;
    int y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double DistanceFrom(point p){
        double xfactor = Math.pow(p.x - this.x , 2);
        double yfactor = Math.pow(p.y - this.y , 2);
        return Math.sqrt(xfactor + yfactor);
    }
    public static void main(String[] args) {
        point p1 = new point(5,7);
        point p2 = new point(-4,-2);
        System.out.println(p1.DistanceFrom(p2));
        System.out.println(p2.DistanceFrom(p1));

    }
}



