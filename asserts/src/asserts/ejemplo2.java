package asserts;

public class ejemplo2 {

	public static void main(String[] args) {
		int[] a1 = {3, 9, 2, 7};
        assert a1 != null && a1.length > 0 : "se necesita un array no vacío";
        int max1 = a1[0];
        for (int v : a1) {
            if (v > max1) {
                max1 = v;
            }
        }
        for (int v : a1) {
            assert max1 >= v : "el máximo calculado (" + max1 + ") es menor que un elemento (" + v + ")";
        }
        System.out.println("Máximo de {3, 9, 2, 7}: " + max1);

        int[] a2 = {-5};
        assert a2 != null && a2.length > 0 : "se necesita un array no vacío";
        int max2 = a2[0];
        for (int v : a2) {
            if (v > max2) {
                max2 = v;
            }
        }
        for (int v : a2) {
            assert max2 >= v : "el máximo calculado (" + max2 + ") es menor que un elemento (" + v + ")";
        }
        System.out.println("Máximo de {-5}: " + max2);

        System.out.println("Probando la precondición con un array vacío...");
        int[] a3 = {};
        assert a3 != null && a3.length > 0 : "se necesita un array no vacío";
        int max3 = a3[0];
        for (int v : a3) {
            if (v > max3) {
                max3 = v;
            }
        }
        for (int v : a3) {
            assert max3 >= v : "el máximo calculado (" + max3 + ") es menor que un elemento (" + v + ")";
        }
        System.out.println("Máximo de {}: " + max3);
	}

}
