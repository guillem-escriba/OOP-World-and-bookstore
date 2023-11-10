public class City extends GeoPoint {
    private int numhab;

    public City(double xi, double yi, String n, int h) {
        super(xi,yi,n);
        numhab = h;
    }
    public int getNumhab() {
        return numhab;
    }
    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }
}
