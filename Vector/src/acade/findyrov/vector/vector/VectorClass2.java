package acade.findyrov.vector.vector;

import acade.findyrov.vector.vector.VectorClass;

public class VectorClass2 extends VectorClass {
    private final VectorClass vector2;

    public VectorClass2(int n, VectorClass vector) {
        super(n);
        this.vector2 = vector;
    }

    public VectorClass getVector2() {
        return vector2;
    }
}
