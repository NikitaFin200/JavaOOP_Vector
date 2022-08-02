package acade.findyrov.vector;

import java.util.Vector;

public class VectorClass {
    private final Vector vector;

    public VectorClass(int n, double n1, double n2, double n3) {
        Vector<Double> vector = new Vector<>(n);
        this.vector = vector;
        vector.add(n1);
        vector.add(n2);
        vector.add(n3);
    }

    public double getSizeee() {
        return vector.size();
    }
}
