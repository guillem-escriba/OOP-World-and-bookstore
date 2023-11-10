public class CircularRegion extends EllipsoidalRegion{

    public CircularRegion(Point c, double r) {
        super(c, r, r); // La región circular es idéntica a la elipsoidal solo que con ambos radios iguales.
    }
}
