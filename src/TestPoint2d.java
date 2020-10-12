public class TestPoint2d {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(2,2);
        float[] arr = point2d.getXY();
        for (float x:arr) {
            System.out.println(x);
        }
    }
}
