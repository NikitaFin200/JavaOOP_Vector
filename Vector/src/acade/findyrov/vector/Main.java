package acade.findyrov.vector;

import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Object> vector1 = new Vector<>(5);
        vector1.add(5);

        Vector<Object> vector2 = new Vector<>(vector1);
        System.out.println(vector1);
        System.out.println(vector2);

        String[] mas = {"Hello", "Bye", "ok"};
        Vector<String> vector3 = new Vector<>(Arrays.asList(mas));

        System.out.println(vector3);

        Vector<String> vector4 = new Vector<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i >= mas.length) {
                vector4.add(null);
            } else {
                vector4.addElement(mas[i]);
            }
        }
        System.out.println(vector4);

        VectorClass newvector = new VectorClass(5, 6.5, 6, 7.9);

        System.out.println(newvector.getSizeee());
    }
}
