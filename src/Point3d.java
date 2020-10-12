public class Point3d extends Point2d {
    float z = 0.0f;
    public Point3d(float x, float y ,float z){
        super(x, y);
        this.z = z;
    }

    public Point3d(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arrays = new float[3];
        arrays[0] = x;
        arrays[1] = y;
        arrays[2] = z;
        return arrays;
    }

    @Override
    public String toString() {
        return "(x,y.z)" + super.toString();
    }
}
