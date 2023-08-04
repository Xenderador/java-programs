/* Implementing method over-riding */
package Method_Overriding;

class ModOve {
    int i, j;

    ModOve(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class Another extends ModOve {
    int k;

    Another(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k – this overrides show() in A
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

class method_overriding {
    public static void main(String args[]) {

        Another obj = new Another(1, 2, 3);

        // this calls show() method in Another
        obj.show();
    }
}
