public class TestPoint3d {
    public static void main(String[] args) {
        Point3d point3d = new Point3d(2,4,1);
        float[] arr = point3d.getXYZ();
        for (float x:arr) {
            System.out.println(x);
        }
    }
}
